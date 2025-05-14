package com.Auth_service.fclient;

import com.Auth_service.dto.Employee;
import com.Auth_service.dto.UserDTO;
import com.Auth_service.dto.UserLoginRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-management-service")
public interface UserClient {
    @PostMapping("/api/v1/validate")
    UserDTO validateUser(@RequestBody UserLoginRequest request);

    @PostMapping("/api/v1/register")
    public ResponseEntity<String> register(@RequestBody Employee user);

}
