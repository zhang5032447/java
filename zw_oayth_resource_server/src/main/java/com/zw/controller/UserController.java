package com.zw.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PreAuthorize(value = "hasAnyAuthority('ROOT')")
    @RequestMapping("/zw/query1")
    public String query1() {
        return "query1...";
    }

    @PreAuthorize(value = "hasAnyAuthority('USER')")
    @RequestMapping("/zw/query2")
    public String query2() {
        return "query2...";
    }
}
