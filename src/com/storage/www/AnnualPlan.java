package com.storage.www;

public class AnnualPlan extends Plan{

    public AnnualPlan() {
        this.strategy = new AnnualDiscount();
    }

}
