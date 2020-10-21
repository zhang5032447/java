package com.zw.example.anno;

public class User {
    private Integer id;

    private String userName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                "}";
    }

    public int add(int a, int b) {
        return a + b;
    }
}
