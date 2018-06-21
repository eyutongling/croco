package com.luan;

/**
 * Created by Administrator on 2018/1/27 0027.
 */
public class 全排列 {
    private boolean isVisited[]=new boolean[10];
    private StringBuilder sb=new StringBuilder();

    public static void main(String[] args) {

        new 全排列().dfs(4,1);
    }

    void dfs(int sum,int step){
        if (step==sum+1){
            System.out.println(sb);
            return;
        }
        for (int i = 1; i <=sum; i++) {
            if (!isVisited[i]){
                sb.append(i);
                isVisited[i]=true;
                dfs(sum,step+1);
                isVisited[i]=false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
