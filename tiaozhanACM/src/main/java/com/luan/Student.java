package com.luan;

public class Student
{
    private String name = null;

    public Student(String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @SuppressWarnings("unused")
    private int calcADD(int a, int b)
    {
        return a + b;
    }

    private int useCalculator(int a, int b)
    {
        return new Calculator().add(a,b);
    }

    public void callHelp (int a, int b)
    {
        new SuperCalculator().add(a, b, this);
    }

    public void fillBlank(int a, int b, int result)
    {
        System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
    }
}