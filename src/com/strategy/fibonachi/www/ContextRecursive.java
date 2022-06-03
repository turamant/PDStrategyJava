package com.strategy.fibonachi.www;

public class ContextRecursive extends Context{
    public ContextRecursive() {
        this.strategy = new Recursive();
    }
}
