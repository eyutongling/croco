package com.luan;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/26 0026.
 */
public class 三角形 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        int max=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    max=Math.max(max,f(arr[i],arr[j],arr[k]));
                }
            }
        }
        System.out.println(max);
    }
    public static int f(int a,int b,int c){
        int len=a+b+c;
        int max=Math.max(a,Math.max(b,c));
        if (max < len-max){
            return len;
        }
        return 0;
    }
}
