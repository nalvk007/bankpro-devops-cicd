package com.bankpro.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {
    @GetMapping("/")
    public String home() {
        return "BankPro Service is Running";
    }
}
