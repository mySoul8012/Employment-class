package com.ming;

public class MyTask implements Runnable{
    private int count = 100;

    @Override
    public void run() {
        while(true){
            if(count > 0){
                try{
                    Thread.sleep(20);
                }catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票");
                count--;
            }else{
                break;
            }
        }
    }
}
