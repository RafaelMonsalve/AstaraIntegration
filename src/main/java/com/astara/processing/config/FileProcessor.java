package com.astara.processing.config;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;

@Component
public class FileProcessor {

    @ServiceActivator(inputChannel = "sftpChannel")
    public void processFile(Message<File> message){

        File file=message.getPayload();
        processFileContents(file);
    }

    private void processFileContents(File file) {
        // Aquí puedes implementar la lógica para mapear y procesar el archivo
        // Por ejemplo, puedes usar librerías como Jackson para deserializar el contenido del archivo
    }
}
