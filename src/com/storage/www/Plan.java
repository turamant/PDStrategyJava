package com.storage.www;

public class Plan {
    // Context
    Double price;
    DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
    public Double subscriptionPrice(Double price) {
        return this.strategy.calculateDiscountedPrice(price);
    }
}
