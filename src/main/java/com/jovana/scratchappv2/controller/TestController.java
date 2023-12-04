package com.jovana.scratchappv2.controller;

import com.jovana.scratchappv2.entities.User;
import com.jovana.scratchappv2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jovana on 04.12.2023
 */
@RequestMapping("/api/test")
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/me")
    public ResponseEntity<User> authenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User currentUser = (User) authentication.getPrincipal();
        return ResponseEntity.ok(currentUser);
    }

}
