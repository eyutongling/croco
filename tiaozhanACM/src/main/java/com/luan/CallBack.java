package com.luan;

/**
 * Created by Administrator on 2018/1/27 0027.
 */
public interface CallBack {
    public void solve(String result);
}
class Wang implements CallBack{
    private Li li;
    public Wang(Li li){
        this.li=li;
    }
    public void askQuestion(String question){
        new Thread(new Runnable() {
            @Override
            public void run() {
                li.executeMessage(Wang.this,question);
            }
        }).start();
        play();
    }
    public void play(){
        System.out.println("打球");
    }

    @Override
    public void solve(String result) {
        System.out.println("给小李调用的方法，小李得到答案后就调用这个");
        System.out.println("告诉全世界，结果是"+result);
    }
}
class Li{
    public void executeMessage(CallBack callBack,String question){
        System.out.println("解决小王的问题"+question);
        String result="得到答案";
        callBack.solve(result);
    }
}
class Test{
    public static void main(String[] args) {
        Li li=new Li();
        Wang wang=new Wang(li);
        wang.askQuestion("1+1=?");
    }
}