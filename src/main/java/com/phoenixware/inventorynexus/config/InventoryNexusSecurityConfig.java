package com.phoenixware.inventorynexus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class InventoryNexusSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails collin = User.builder()
                .username("cshort2112")
                .password("myAwesomePass1984")
                .roles("ADMIN", "MANAGER", "USER")
                .build();

        UserDetails sofiya = User.builder()
                .username("skarpi2")
                .password("someCoolVersion8080")
                .roles("MANAGER", "USER")
                .build();

        UserDetails employee1 = User.builder()
                .username("employee1")
                .password("someBasicPassword")
                .roles("EMPLOYEE", "USER")
                .build();

        UserDetails someOtherUser = User.builder()
                .username("someOtherUser")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(collin, sofiya, someOtherUser, employee1);
    }
}
