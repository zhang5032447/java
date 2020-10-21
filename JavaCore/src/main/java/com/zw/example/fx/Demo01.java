package com.zw.example.fx;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("hello");
        list.add("1123");
        for (Object obj : list) {
            System.out.println((String) obj);
        }
        List<Number> list2 = new ArrayList<Number>();

        loop(list2);

    }

    public static void loop(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void loop2(List<? super Integer> list) {

    }
}
