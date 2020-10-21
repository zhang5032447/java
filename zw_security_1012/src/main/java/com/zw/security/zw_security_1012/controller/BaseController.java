package com.zw.security.zw_security_1012.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/login.html")
    public String loginPage() {
        return "/login.html";
    }

    @GetMapping("/home.html")
    public String homePage() {
        return "/home.html";
    }

    @GetMapping("/")
    public String basePage() {
        return "/home.html";
    }

    @GetMapping("/error.html")
    public String errorPage() {
        return "/error.html";
    }
}
