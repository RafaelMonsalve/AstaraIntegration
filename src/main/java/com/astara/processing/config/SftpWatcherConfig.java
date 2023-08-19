package com.astara.processing.config;


import com.jcraft.jsch.ChannelSftp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.file.filters.AcceptOnceFileListFilter;
import org.springframework.integration.file.remote.session.CachingSessionFactory;
import org.springframework.integration.file.remote.session.SessionFactory;
import org.springframework.integration.sftp.filters.SftpSimplePatternFileListFilter;
import org.springframework.integration.sftp.inbound.SftpInboundFileSynchronizer;
import org.springframework.integration.sftp.inbound.SftpInboundFileSynchronizingMessageSource;
import org.springframework.integration.sftp.session.DefaultSftpSessionFactory;
import org.springframework.messaging.MessageChannel;

import java.io.File;
import java.io.InputStream;

@Configuration
@EnableIntegration
public class SftpWatcherConfig {

    @Bean
    public SftpInboundFileSynchronizer sftpInboundFileSynchronizer(){
        SftpInboundFileSynchronizer synchronizer=new SftpInboundFileSynchronizer(sessionFactory());
        synchronizer.setDeleteRemoteFiles(false);
        synchronizer.setRemoteDirectory("/ftp");
        synchronizer.setFilter(new SftpSimplePatternFileListFilter("*.txt"));
        return synchronizer;
    }

    @Bean
    public SessionFactory<ChannelSftp.LsEntry> sessionFactory(){
        DefaultSftpSessionFactory factory=new DefaultSftpSessionFactory (true);
        factory.setHost("127.0.0.1");
        factory.setPort(21);
        factory.setUser("user");
        factory.setPassword("1234");
        factory.setAllowUnknownKeys(true);
        return new CachingSessionFactory<>(factory);
    }

    @Bean
    SftpInboundFileSynchronizingMessageSource ftpMessageSource(){
        SftpInboundFileSynchronizingMessageSource source=new SftpInboundFileSynchronizingMessageSource(sftpInboundFileSynchronizer());
        source.setAutoCreateLocalDirectory(false);
        source.setAutoCreateLocalDirectory(true);
        source.setLocalDirectory(new File("/ftp"));
        source.setLocalFilter(new AcceptOnceFileListFilter<>());
        return source;
    }

    @Bean
    @InboundChannelAdapter(channel = "sftpChannel", poller = @Poller(fixedDelay = "1000"))
    public MessageSource<File> sftpMessageSourceAdapter() {
        return ftpMessageSource();
    }

    @Bean
    public MessageChannel sftpChannel(){
        return new DirectChannel();
    }

}
