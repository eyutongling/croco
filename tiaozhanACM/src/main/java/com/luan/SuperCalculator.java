package com.luan;

/**
 * Created by Administrator on 2018/1/27 0027.
 */
public class SuperCalculator
{
    public void add(int a, int b, Student  xiaoming)
    {
        int result = a + b;
        xiaoming.fillBlank(a, b, result);
    }
}