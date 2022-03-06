package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/")
public class TestContorller {
    @GetMapping(path="test")
    public String hello(){
        return new String("Hello the test working!");
    }
}
