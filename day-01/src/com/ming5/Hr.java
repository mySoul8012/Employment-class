package com.ming5;

public class Hr extends Worker {
    public Hr() {
        super();
    }

    @Override
    public void worker() {
        System.out.println("Hr");
    }

    public Hr(String name, String gender, int num, double salary) {
        super(name, gender, num, salary);
    }
}
