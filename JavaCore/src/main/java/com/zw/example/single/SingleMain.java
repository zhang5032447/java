package com.zw.example.single;

public class SingleMain {
    public static void main(String[] args) throws Exception {
        PersonSingle p1 = PersonSingle.getInstance();
        PersonSingle p2 = PersonSingle.getInstance();
        PersonSingle p3 = PersonSingle.getInstance();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // 通过反射获取实例
        p1.getClass().getDeclaredConstructor(null);
    }
}
