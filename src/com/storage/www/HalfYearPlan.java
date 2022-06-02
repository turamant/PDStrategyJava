package com.storage.www;

public class HalfYearPlan extends Plan{
    public HalfYearPlan() {
        strategy = new HalfYearDiscount();
    }
}
