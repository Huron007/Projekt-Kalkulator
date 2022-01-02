package com.example.kalkulator;

public class Calculator {

    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println(a+b);
    }
    public void subtract(){
        System.out.println(a-b);
    }
}
