package com.luan.frank;

/**
 * Created by Administrator on 2018/1/25 0025.
 */
public class ActiveObject extends Thread {
    private ActiveQueue _queue;
    public ActiveObject(){
        _queue=new ActiveQueue();
        start();
    }
    public void enqueue(MethodRequest mr){
        _queue.enqueue(mr);
    }

    @Override
    public void run() {
        while (true){
            MethodRequest mr=_queue.dequeue();
            mr.call();
        }
    }
}
