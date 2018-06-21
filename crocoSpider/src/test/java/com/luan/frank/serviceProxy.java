package com.luan.frank;

/**
 * Created by Administrator on 2018/1/25 0025.
 */
public class serviceProxy implements Service {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
