package com.zw.example;

import com.zw.example.fs.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }
}
