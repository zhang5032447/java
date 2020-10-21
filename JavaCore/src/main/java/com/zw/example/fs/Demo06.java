package com.zw.example.fs;

import java.lang.reflect.Constructor;

public class Demo06 {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        // 获取所有的公有的构造器
        Constructor<?>[] constructors1 = userClass.getConstructors();
        for (Constructor c : constructors1) {
            System.out.println(c.getModifiers() + " " + c.getName());
        }
        System.out.println("-------------------");
        // 获取所有的构造器
        Constructor<?>[] constructors2 = userClass.getDeclaredConstructors();
        for (Constructor c : constructors2) {
            System.out.println(c.getModifiers() + " " + c.getName());
        }
        System.out.println("-------------------");
        // 1. 直接通过newInstance创建对象
        User user = userClass.newInstance();
        // 2. 获取对应的Construction对象获取实例
        Constructor<User> constructor1 = userClass.getDeclaredConstructor(String.class, String.class);
        // 私有的构造器调用放开权限
        constructor1.setAccessible(true);
        constructor1.newInstance("gg", "男");
    }
}
