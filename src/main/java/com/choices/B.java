package com.choices;

public class B extends A{
    public double getNum(double d){
        return 4.0d;
    }
    public static void main(String[] args){
        B b=new B();
        System.out.println(b.getNum(1));
    }
}