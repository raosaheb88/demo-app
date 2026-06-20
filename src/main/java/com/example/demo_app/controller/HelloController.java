package com.example.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private String username = "RD5710";
    private String password = "rd12345";
    
    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("HelloController: sayHello() called");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        return "Hello, World!";
    }

}
