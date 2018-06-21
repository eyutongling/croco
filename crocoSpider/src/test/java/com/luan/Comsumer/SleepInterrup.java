package com.luan.Comsumer;

/**
 * Created by Administrator on 2018/1/25 0025.
 */
public class SleepInterrup implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("int run() -about to sleep for 20 seconds");
            Thread.sleep(10000);
            System.out.println("in -run() woke up");
        }catch (InterruptedException e){
            System.out.println("int run() interruped while sheeping");
            //return;
        }
        System.out.println("in run() -Leaving");
    }

    public static void main(String[] args) {
        SleepInterrup sleepInterrup=new SleepInterrup();
        Thread thread=new Thread(sleepInterrup);
        thread.start();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("in mian() -interrupted other thread");
        thread.interrupt();
        System.out.println("in mian() -leaving");
    }
}
