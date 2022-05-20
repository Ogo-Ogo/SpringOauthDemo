package com.example.oauth2tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWrd() {
        return "hello world";
    }

    @GetMapping("/restricted")
    public String restricted(){
        return "to see this text u need to be log in";
    }
    
}
