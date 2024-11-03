package com.example.hello_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")

   public String hello()
    {
        return "Hello, World Im Using Spring Boot and Maven";
    }

}
