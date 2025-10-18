package com.example.demo;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot is working!";
    }

    @GetMapping("/greet")
    public String greetUser() {
        return "Welcome to your first Spring Boot app!";
    }

@GetMapping("/greet/{name}")
public String greetByName(@PathVariable String name) {
    return "Hello, " + name + "! Welcome to Spring Boot!";
}
}