package com.storage.www;

public class HalfYearDiscount implements DiscountStrategy{
    @Override
    public int percentOff() {
        return 20;
    }
}
