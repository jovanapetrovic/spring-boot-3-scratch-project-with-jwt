package com.jovana.scratchappv2.controller;

import com.jovana.scratchappv2.dto.LoginRequest;
import com.jovana.scratchappv2.dto.LoginResponse;
import com.jovana.scratchappv2.dto.RegisterRequest;
import com.jovana.scratchappv2.entities.User;
import com.jovana.scratchappv2.services.JwtTokenService;
import com.jovana.scratchappv2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jovana on 04.12.2023
 */
@RequestMapping("/api/auth/")
@RestController
public class AuthController {
    @Autowired
    private JwtTokenService jwtService;
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest registerRequest) {
        User registeredUser = userService.register(registerRequest);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        User authenticatedUser = userService.login(loginRequest);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = LoginResponse.builder()
                .token(jwtToken)
                .expiresIn(jwtService.getExpirationTime())
                .build();

        return ResponseEntity.ok(loginResponse);
    }
}
