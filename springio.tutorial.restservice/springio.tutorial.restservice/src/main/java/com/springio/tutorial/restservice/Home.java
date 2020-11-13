package com.springio.tutorial.restservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Home {

    @GetMapping("/")
    public String home() {
        return "Hello";
    }

}
