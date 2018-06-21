package com.luan.spider;


public class MyThread3 extends Thread
{
    private int count;
    MyThread3(int count){
        this.count=count;
    }
    public synchronized void acq(){
        while (count==0){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        count--;
    }
    public synchronized void release(){
        count++;
        notify();
    }
}
