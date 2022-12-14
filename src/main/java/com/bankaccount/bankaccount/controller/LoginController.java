package com.bankaccount.bankaccount.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class LoginController {
    @GetMapping("/login")
    public Map<String, Object> login(Principal principal) {
        String email = principal.getName();
        Map<String, Object> userDetails = new HashMap<>();
        userDetails.put("email", email);
        return userDetails;

    }
}
