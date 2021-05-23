package com.example.springBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {
    @RequestMapping(path = "/helloSpringBoot")
    public String HelloSpring(){
        return "hello spring boot";
    }
}
