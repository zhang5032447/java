package com.zw.example.single;

public class PersonSingle {
    private static PersonSingle instance;

    private PersonSingle() {
        if(instance != null) {
            throw new RuntimeException("不允许重复创建");
        }
    }

    public static PersonSingle getInstance() {
        if (instance == null) {
            instance = new PersonSingle();
        }
        return instance;
    }
}
