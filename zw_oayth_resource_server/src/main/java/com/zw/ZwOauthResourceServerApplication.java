package com.zw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
public class ZwOauthResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZwOauthResourceServerApplication.class, args);
    }

}
