package com.example.demoapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloWorld")
    public String printHelloWorld(){
        return "Hello Sashi1 World";

    }

}
