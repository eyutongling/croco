package com.luan;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/26 0026.
 */
public class 抽签 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]arr=new int[n];
        int m=scanner.nextInt();
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l < arr.length; l++) {
                        if (arr[i]+arr[j]+arr[k]+arr[l]==m){
                            flag=true;
                        }
                    }
                }
            }
        }
        if (flag==false){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
