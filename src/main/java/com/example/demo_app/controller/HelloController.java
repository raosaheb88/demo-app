package com.example.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static String serverName = "rd-784-415";
    
    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Received request on server: " + serverName);
        return "Hello, World!";
    }

}
