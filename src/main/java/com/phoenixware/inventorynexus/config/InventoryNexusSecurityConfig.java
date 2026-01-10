package com.phoenixware.inventorynexus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class InventoryNexusSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails collin = User.builder()
                .username("cshort2112")
                .password("{noop}myAwesomePass1984")
                .roles("ADMIN", "MANAGER", "USER")
                .build();

        UserDetails sofiya = User.builder()
                .username("skarpi2")
                .password("{noop}someCoolVersion8080")
                .roles("MANAGER", "USER")
                .build();

        UserDetails employee1 = User.builder()
                .username("employee1")
                .password("{noop}someBasicPassword")
                .roles("EMPLOYEE", "USER")
                .build();

        UserDetails someOtherUser = User.builder()
                .username("someOtherUser")
                .password("{noop}password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(collin, sofiya, someOtherUser, employee1);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/orders").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "/orders/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "/orders").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "/orders/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PATCH, "/orders/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/orders/**").hasRole("ADMIN"));

        http.httpBasic(Customizer.withDefaults());

        // disable CSRF or Cross Site Request Forgery... This will be a stateless API.
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
