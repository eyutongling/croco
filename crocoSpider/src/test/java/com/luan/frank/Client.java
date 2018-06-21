package com.luan.frank;

import javax.swing.text.AsyncBoxView;

/**
 * Created by Administrator on 2018/1/25 0025.
 */
public class Client {
    private Service s;
    public Client(Service s){
        this.s=s;
    }
    public void requestMethod(){
        s.sayHello();
    }

    public static void main(String[] args) {
        Service s=new serviceProxy();
        Thread thread= new ActiveObject();
        thread.start();
    }
}
