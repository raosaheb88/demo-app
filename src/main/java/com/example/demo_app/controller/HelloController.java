package com.example.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {


    private final String password = "rd598741";
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

}
