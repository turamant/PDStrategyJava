package com.strategy.fibonachi.www;

public class Main {
    public static void main(String[] args) {
        //Context context = new Context();
        //context.setStrategy(new Recursive());
        //context.setStrategy(new Memoization());
        //context.setStrategy(new Effective());

        var recursive = new ContextRecursive();
        System.out.println("Рекурсивный метод: " + recursive.executeStrategy(33));

        var effective = new ContextEffective();
        System.out.println("Эффективный метод: " + effective.executeStrategy(33));

        var memoization = new ContextMemoization();
        System.out.println("C мемоизацией: " + memoization.executeStrategy(33));



    }
}
