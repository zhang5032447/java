package com.zw.example.fs;

import java.lang.reflect.Field;

public class Demo04 {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        User user = userClass.newInstance();

        // 获取类型中定义的字段，公有字段以及父类中公有的字段
        Field[] fields1 = userClass.getFields();
        for (Field f : fields1) {
            System.out.println(f.getModifiers() + " " + f.getName());
        }

        System.out.println("----------------------------");

        // 可以获取私有字段，只能获取当前类中的字段
        Field[] fields2 = userClass.getDeclaredFields();
        for (Field f : fields2) {
            System.out.println(f.getModifiers() + " " + f.getName());
        }

        System.out.println("----------------------------");

        // 获取name字段对应的Field
        Field nameField = userClass.getDeclaredField("name");
        // 如果要修改私有属性信息，需要放开权限
        nameField.setAccessible(true);
        nameField.set(user, "1111");
        System.out.println(user.getName());

        System.out.println("----------------------------");

        // 静态属性赋值
        Field addressField = userClass.getDeclaredField("address");
        addressField.set(null, "2222");
        System.out.println(User.address);
    }
}
