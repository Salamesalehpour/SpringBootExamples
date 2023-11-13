package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${helloWorldMessage}")
    private String message;
    @GetMapping("/")
    public String sayHello(){
        return message;
    }
}
