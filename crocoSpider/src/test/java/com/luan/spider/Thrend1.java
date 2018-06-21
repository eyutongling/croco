package com.luan.spider;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2018/1/21 0021.
 */
public class Thrend1<T> {


    public static void main(String[] args) {
        Thread thread1=new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread1.start();
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread2.start();


        //测试会执行哪个的run方法
        Thread threadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是Runnable的run方法");
            }
        }){
            @Override
            public void run() {
                System.out.println("我是Thread的run方法");
            }
        };
        threadThree.start();
    }
}
