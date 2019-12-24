package com.ming1;

public class UILecturer extends Staff implements Drawing{


    @Override
    public void drawing() {
        System.out.println("drawing");
    }

    @Override
    public void worker() {
        System.out.println("worker");
    }
}
