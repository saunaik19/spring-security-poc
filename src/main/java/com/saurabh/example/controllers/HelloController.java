package com.saurabh.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "home.jsp";
    }

    @RequestMapping("/login")
    public String login() {
        return "login.jsp";
    }

    @RequestMapping("/logout-success")
    public String logout() {
        return "logout.jsp";
    }
}
