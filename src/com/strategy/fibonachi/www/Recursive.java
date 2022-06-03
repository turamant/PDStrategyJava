package com.strategy.fibonachi.www;

public class Recursive implements Strategy{
    @Override
    public long fib(int n) {
        if (n > 30){
            System.out.println("Ограничение до 30! ");
            n = 30;
        }
        if (n < 2){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
