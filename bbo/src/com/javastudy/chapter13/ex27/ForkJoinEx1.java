package com.javastudy.chapter13.ex27;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinEx1 {
    static final ForkJoinPool pool = new ForkJoinPool();

    public static void main(String[] args) {
        long from = 1L, to = 100_000_000L;

        SumTask task = new SumTask(from,to);

        long start = System.currentTimeMillis();
        long res = pool.invoke(task);

        System.out.printf("sum of %d %d = %d %n", from, to ,res);

        System.out.println();
        res = 0L;
        start = System.currentTimeMillis();
        for(long i = from; i <=to ; i++) {
            res +=i;
        }
        System.out.println("Elapsed time(1core): " + (System.currentTimeMillis()  - start));
    }
}
