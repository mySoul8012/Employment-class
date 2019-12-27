package com.ming11;

public class Thread implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        // 进行读取
        while(true) {
            if (false) {
                System.out.println("进行输出");
            }else{
                System.out.println("不进行输出");
            }
        }
    }

    // 对flage 进行修改

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
