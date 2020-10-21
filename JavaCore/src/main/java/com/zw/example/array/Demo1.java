package com.zw.example.array;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.remove(1);

        LinkedList b = new LinkedList();
        b.push(1);
        b.add(1);

        Vector c = new Vector();
        c.add(1);

        Collections.synchronizedList(a);

        TreeMap ma = new TreeMap();
        ma.put(1, 2);

        HashMap hm = new HashMap();
        hm.put(1, 2);
    }
}
