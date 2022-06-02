package com.storage.www;

import java.math.BigDecimal;

public interface DiscountStrategy {
    public int percentOff();

    public default Double calculateDiscountedPrice(Double price) {
        return price - price * this.percentOff() /100;
    }
}
