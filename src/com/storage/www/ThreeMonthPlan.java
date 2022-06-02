package com.storage.www;

public class ThreeMonthPlan extends Plan{
    public ThreeMonthPlan() {
        this.strategy = new ThreeMonthDiscount();
    }
}
