package com.example.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TimeZone;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

}
