package com.example.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class HelloController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/pwd")
    public String getPassword() {
        String password = "rd598741";
        System.out.println("Password: " + password);
        return password;
    }

    @GetMapping("/current-dir")
    public String getCurrentDirectory() {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current Directory: " + currentDir);
        return currentDir;
    }

    @GetMapping("/getTime")
    public String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println("sdf: " + sdf.format(new Date()));
        return sdf.format(new Date());
    }

}
