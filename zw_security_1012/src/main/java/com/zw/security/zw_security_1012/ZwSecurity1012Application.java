package com.zw.security.zw_security_1012;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableGlobalMethodSecurity(jsr250Enabled = true)
@EnableGlobalMethodSecurity(securedEnabled = true)
public class ZwSecurity1012Application {

    public static void main(String[] args) {
        SpringApplication.run(ZwSecurity1012Application.class, args);
    }

}
