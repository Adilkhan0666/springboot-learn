package com.springboot.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("hello")
    public String hello(){
        return  "Hello Adil welcome to Springboot-learn";
    }
}
