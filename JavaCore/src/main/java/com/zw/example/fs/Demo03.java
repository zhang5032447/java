package com.zw.example.fs;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        Class<User> clazz1 = User.class;
        Class<?> clazz2 = Class.forName("com.zw.example.fs.User");
        Class<? extends User> clazz3 = new User().getClass();
        Class<?> clazz4 = Demo03.class.getClassLoader().loadClass("com.zw.example.fs.User");

        System.out.println(clazz1.getModifiers());
        System.out.println(clazz1.getPackage());
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSuperclass());
        System.out.println(clazz1.getClassLoader());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getInterfaces());
        System.out.println(clazz1.getAnnotations());
    }
}
