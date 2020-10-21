package com.zw.demo.annotaion.configuration;

import com.zw.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Person person() {
        return new Person("TT", 18);
    }
}
