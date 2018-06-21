package com.luan.spider;

import com.luan.spider.pojo.Company;

/**
 * Created by Administrator on 2018/1/20 0020.
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a=a;
    }
    public void set(T a){this.a = a;}
    public T get(){return a;}

    public static void main(String[] args) {
        Holder3<String> stringHolder3=new Holder3<>("haha");
        System.out.println(stringHolder3.get());
        Holder3<Company> company=new Holder3<>(new Company());
        Company co=company.get();
    }




}
