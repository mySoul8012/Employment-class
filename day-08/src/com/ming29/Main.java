package com.ming29;

public class Main {
    public static void main(String[] args){
        Test test = new Test(true);
        Thread thread = new Thread(test);
        test.setFlage(false);
        Thread thread1 = new Thread(test);
        thread.start();
        thread1.start();
        // 进行循环读取
        while(true){
            if(test.getCopyOnWriteArrayList().size() >= 2000) {
                // 输出
                for (int i = 0; i < test.getCopyOnWriteArrayList().size(); i++) {
                    // 输出
                    System.out.println(test.getCopyOnWriteArrayList().get(i));
                }
            }
        }
    }
}
