package com.luan.frank;

/**
 * Created by Administrator on 2018/1/25 0025.
 */
public class SayHello implements MethodRequest {
    public SayHello(Service s){
        _service=s;
    }
    @Override
    public void call() {
        _service.sayHello();
    }
    private Service _service;
}
