package com.ming2;

public class SingIntegerNumber02 implements SingInteger {
    private SingInteger singInteger;

    public SingIntegerNumber02(SingInteger singInteger) {
        this.singInteger = singInteger;
    }

    @Override
    public void number() {
        singInteger.number();
    }

    @Override
    public void number01() {
        singInteger.number01();
    }
}
