package com.zw.example.fs;

import java.lang.reflect.Method;

public class Demo05 {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        User user = userClass.newInstance();
        // 可以获取当前类以及父类中的所有的公有的方法
        Method[] methods1 = userClass.getMethods();
        for (Method m : methods1) {
            System.out.println(m.getModifiers() + " " + m.getName());
        }
        System.out.println("--------------------");
        // 可以获取私有方法，只能获取当前类中的方法
        Method[] methods2 = userClass.getDeclaredMethods();
        for (Method m : methods2) {
            System.out.println(m.getModifiers() + " " + m.getName());
        }
        System.out.println("--------------------");
        Method jumpMethod = userClass.getDeclaredMethod("jump");
        // 放开私有方法的调用权限
        jumpMethod.setAccessible(true);
        jumpMethod.invoke(user);
        System.out.println("--------------------");
        // 静态方法调用
        Method sayMethod = userClass.getDeclaredMethod("say", String.class);
        sayMethod.invoke(null, "666");
    }
}
