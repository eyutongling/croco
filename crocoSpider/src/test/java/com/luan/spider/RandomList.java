package com.luan.spider;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2018/1/21 0021.
 */
public class RandomList<T> {
    private ArrayList<T> strorage=new ArrayList<T>();
    private Random random=new Random(47);
    public void add(T item){
        strorage.add(item);
    }
    public T select(){
        return strorage.get(random.nextInt(strorage.size()));
    }
    public static void main(String[] args) {
        RandomList<String> rs=new RandomList<>();
        for (String s:("the quike brown fox jumeped over"+"the lazy brown dog").split(" ")){
           rs.add(s);
           for (int i=0;i<29;i++){
               System.out.println(rs.select()+ " ");
           }
        }
    }
}
