package com.ming;

public class VolatileThread extends Thread{
    private boolean flag = false;
    public boolean isFlag(){
        return flag;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.flag = true;
        System.out.println("flag = " + flag);
    }
}
