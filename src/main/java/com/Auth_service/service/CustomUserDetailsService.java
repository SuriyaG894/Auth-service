package com.Auth_service.service;



import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public org.springframework.security.core.userdetails.User loadUserByUsername(String username) throws UsernameNotFoundException {
        // Mock User Authentication (Replace with real DB logic)
        if ("user".equals(username)) {
            return new User("user", "{noop}password", List.of(() -> "ROLE_USER"));
        } else if ("admin".equals(username)) {
            return new User("admin", "{noop}password", List.of(() -> "ROLE_ADMIN"));
        }
        throw new UsernameNotFoundException("User not found");
    }
}
