package org.studyeasy.SpringRestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/")
    public String demo(){
        return "Hello World";
    }

    @GetMapping("/test")
    public String test(){
        return "Test Api";
    }
    
}
