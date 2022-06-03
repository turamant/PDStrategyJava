package com.strategy.fibonachi.www;

import java.util.HashMap;
import java.util.Map;

public class Memoization implements Strategy{
    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0,0,1,1));
    @Override
    public long fib(int n) {
        if (!memo.containsKey(n)){
            memo.put(n, (int)(fib(n - 1) + fib(n -2)));
        }
        return memo.get(n);
    }
}
