package com.strategy.fibonachi.www;

public class ContextEffective extends Context{
    public ContextEffective() {
        this.strategy = new Effective();
    }
}
