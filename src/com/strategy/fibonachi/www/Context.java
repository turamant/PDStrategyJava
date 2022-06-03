package com.strategy.fibonachi.www;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public long executeStrategy(int n){
        return strategy.fib(n);
    }


}
