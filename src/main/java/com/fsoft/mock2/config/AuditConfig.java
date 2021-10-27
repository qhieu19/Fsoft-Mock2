package com.fsoft.mock2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditConfig{

//    @Bean
//    public AuditorAware<User> auditorProvider() {
//        return new SpringSecurityAuditAwareImpl();
//            }
}

//class SpringSecurityAuditAwareImpl implements AuditorAware<User> {
//
//    @Override
//    public Optional<User> getCurrentAuditor() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication == null ||
//                !authentication.isAuthenticated() ||
//                authentication instanceof AnonymousAuthenticationToken) {
//            return Optional.empty();
//        }
//
//        User user = (User) authentication.getPrincipal();
//
//        return (Optional<User>) Optional.ofNullable(user);
//    }
//}