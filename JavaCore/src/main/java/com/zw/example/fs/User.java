package com.zw.example.fs;

public class User extends Person {
    private String name;
    public String sex;
    public static String address;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    private User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    private void jump() {
        System.out.println("jump...");
    }

    public static void say(String msg) {
        System.out.println("say:" + msg);
    }
}
