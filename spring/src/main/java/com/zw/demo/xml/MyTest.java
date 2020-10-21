package com.zw.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public void test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application");
        Object object = app.getBean("person");
        System.out.println(object);
    }
}
