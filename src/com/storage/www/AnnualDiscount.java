package com.storage.www;

public class AnnualDiscount implements DiscountStrategy{
    private final Double money = 10000.00;
    public AnnualDiscount() {

    }

    public Double getMoney() {
        return money;
    }

    @Override
    public int percentOff() {
        return 50;
    }

    @Override
    public Double calculateDiscountedPrice(Double price) {
        return DiscountStrategy.super.calculateDiscountedPrice(price) - this.getMoney();
    }

}
