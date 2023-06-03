package com.example.eadditives.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerEadditives {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }

}
