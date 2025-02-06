package com.jio.JioPlans.Security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // Disable CSRF protection
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/corp/**","/normal/**","/plan/**").permitAll()
                        // Allow unauthenticated access to /corp /normal /plan endpoints
                        .anyRequest().authenticated() // Secure all other endpoints
                ); // Enable Basic Authentication (if needed)
        return http.build();
    }
}