package com.zw.example.fx;

public class PersonNew<T> {
    private T t;

    public PersonNew(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
