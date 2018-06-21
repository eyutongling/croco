package com.luan.Comsumer;


/**
 * Created by Administrator on 2018/1/25 0025.
 */
class myThread implements Runnable {
    private int ticket=5;

    @Override
    public void run() {
        for (int i= 0;i< 10;i++){
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":ticket = " + ticket--);
                }
            }
        }
    }
}
class RunnableDemo{
    public static void main(String[] args) {
        myThread myThread=new myThread();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }
}