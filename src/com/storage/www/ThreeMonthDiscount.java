package com.storage.www;

import java.math.BigDecimal;

public class ThreeMonthDiscount implements DiscountStrategy{
    @Override
    public int percentOff() {
        return 10;
    }

}
