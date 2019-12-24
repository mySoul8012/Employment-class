package com.ming;

public class MyClass<T, t1, t2> {
    private T t;
    private t1 t1;
    private t2 t2;


    public MyClass() {
    }

    public MyClass(T t, t1 t1, t2 t2) {
        this.t = t;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public t1 getT1() {
        return t1;
    }

    public void setT1(t1 t1) {
        this.t1 = t1;
    }

    public t2 getT2() {
        return t2;
    }

    public void setT2(t2 t2) {
        this.t2 = t2;
    }
}
