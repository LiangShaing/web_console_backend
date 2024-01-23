package com.example.web_console_backend.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {

    @GetMapping("/")
    public String getView() {
        return "index";
    }
}
