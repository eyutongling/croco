package com.luan;

/**
 * Created by Administrator on 2018/1/27 0027.
 */
public class 穷竭搜索 {
    public static int jiesheng(int n){
        if (n==1){
            return 1;
        }
        return n*jiesheng(n-1);
    }
    public static int peibo(int n){
        if (n==1||n==2){
            return 1;
        }
        return peibo(n-1)+peibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(peibo(5));
    }
}
