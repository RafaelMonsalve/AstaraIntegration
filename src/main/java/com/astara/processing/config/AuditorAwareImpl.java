package com.astara.processing.config;

import org.springframework.data.domain.Auditable;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication a = SecurityContextHolder.getContext().getAuthentication();
        if(a==null || !a.isAuthenticated()){
            return Optional.empty();
        }
        return Optional.of(a.getName());
    }
}
