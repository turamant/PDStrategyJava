package com.strategy.fibonachi.www;

public class ContextMemoization extends Context{
    public ContextMemoization() {
        this.strategy = new Memoization();
    }
}
