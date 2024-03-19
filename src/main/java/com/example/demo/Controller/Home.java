package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @Value("${COMMIT_SHORT_SHA}")
    private String shortSHA;
    
    @GetMapping("")
    public String home(){
        String msg = "this is home\n\nVersion: " + shortSHA;
        return msg;
    }
}
