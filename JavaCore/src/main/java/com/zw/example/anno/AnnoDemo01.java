package com.zw.example.anno;

import java.util.Date;

//@SuppressWarnings("all")
public class AnnoDemo01 {

    @Override
    public String toString() {
        return "AnnoDemo01{}";
    }

    @Deprecated
    public void show1() {
        //
    }

    @MyAnno(name = "zz", show4 = @MyAnno2, show3 = {"a", "b"})
    public void show2() {

    }

    public void demo() {
        show1();
        Date date = new Date();
        date.getYear();
    }
}
