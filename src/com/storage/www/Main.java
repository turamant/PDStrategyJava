package com.storage.www;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Double price = 100000.00;
        System.out.println("Pattern Design - com.navigator.www.Strategy!");


        ThreeMonthPlan threeMonthPlan = new ThreeMonthPlan();
        System.out.println("ThreeMonth plan: " + threeMonthPlan.subscriptionPrice(price));

        HalfYearPlan halfYearPlan = new HalfYearPlan();
        System.out.println("HalfYear plan: " + halfYearPlan.subscriptionPrice(price));

        AnnualPlan annualPlan = new AnnualPlan();
        System.out.println("Annual plan: "+annualPlan.subscriptionPrice(price));















    }
}