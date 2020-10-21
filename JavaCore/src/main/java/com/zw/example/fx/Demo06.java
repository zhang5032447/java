package com.zw.example.fx;

public class Demo06 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setIdCard("2234244");

        PersonBean bean = new PersonBean();
        bean.setAddress("address");
        bean.setName("name");
        bean.setAge(18);

        PersonNew<PersonBean> pn = new PersonNew(bean);
        PersonNew<String> pn1 = new PersonNew("111");
    }
}
