package com.zw.security.zw_security_1012.controller;

import org.apache.logging.log4j.util.PerformanceSensitive;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class UserController {

    //    @PreAuthorize(value = "hasRole('ROOT')")
//    @RolesAllowed(value = {"ROOT"})
    @Secured(value = "ROOT")
    @GetMapping("/query")
    public String query() {
        return "query";
    }

    //    @PreAuthorize(value = "hasRole('TEST')")
//    @RolesAllowed(value = {"TEST"})
    @Secured(value = "TEST")
    @GetMapping("/save")
    public String save() {
        return "save";
    }
}
