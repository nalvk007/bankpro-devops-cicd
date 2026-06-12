package com.bankpro.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {

    @GetMapping("/status")
    public String status() {
        return "BankPro Service Running on AWS";
    }
}
