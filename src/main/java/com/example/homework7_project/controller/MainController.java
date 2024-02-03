package com.example.homework7_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/public-data")
    public String user() {
        return "public-data";
    }

    @GetMapping("/private-data")
    public String admin() {
        return "private-data";
    }

}
