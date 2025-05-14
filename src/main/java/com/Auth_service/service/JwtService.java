package com.Auth_service.service;

import com.Auth_service.dto.UserDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Date;

@Service
public class JwtService {
    private static final String SECRET = "thisisascreatcodewihichisusedtoauthenticatetheuser";

    public String generateToken(UserDTO user) {
        return Jwts.builder()
                .claim("roles", user.getRoles())
                .claim("employeeId",user.getEmployeeId())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .setSubject(user.getUsername())
                .signWith(Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8)),SignatureAlgorithm.HS256)
                .compact();
    }
}