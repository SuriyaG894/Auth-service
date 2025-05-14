package com.Auth_service.controller;

import com.Auth_service.dto.*;
import com.Auth_service.fclient.UserClient;
import com.Auth_service.service.CustomUserDetailsService;
import com.Auth_service.dto.LoginRequest;
import com.Auth_service.dto.LoginResponse;
import com.Auth_service.service.CustomUserDetailsService;
import com.Auth_service.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserClient userClient;
    private final JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginRequest request) {
        UserDTO user = userClient.validateUser(request);
        String token = jwtService.generateToken(user);
        return ResponseEntity.ok(Map.of("token", token));
    }

    @GetMapping("/display")
    public ResponseEntity<?> display(){
        System.out.println("Displaying check completed");
        return new ResponseEntity<>("Displaying check completed", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<?> regsiter(@RequestBody Employee employee){
        return userClient.register(employee);
    }
}
