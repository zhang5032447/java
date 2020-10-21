package com.zw.example.anno;

/*
 * 注解本质就是接口
 * */
public @interface MyAnno {

    String name();
    MyAnno2 show4();
    int age() default 18;
//    String show1();
//    int show2();
    String[] show3();
//    PersonEnum show5();
}
