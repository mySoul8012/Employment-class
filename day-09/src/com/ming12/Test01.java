package com.ming12;

public class Test01 implements Runnable {
    private Object object = new Object();

    @Override
    public void run() {
        // 遍历1 - 1000 所有数字
        for(int i = 0; i < 1000; i++){
            // 进行遍历
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                // 进行 wait 等待状态
                try {
                    // 进入等待状态
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
