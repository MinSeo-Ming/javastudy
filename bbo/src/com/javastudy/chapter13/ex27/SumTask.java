package com.javastudy.chapter13.ex27;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {

    long from, to;
    SumTask(long from, long to) {
        this.from = from;
        this.to = to;
    }
    @Override
    protected Long compute() {
        long size = to - from + 1;
        if(size <= 5) {
            return sum();
        }
        long half = (from + to)/2;
        SumTask leftsum = new SumTask(from, half);
        SumTask rightSum = new SumTask(half +1 , to);
        leftsum.fork();

        return rightSum.compute() + leftsum.join();

    }

    long sum() {
        long tmp = 0L;
        for(long i = from ; i <= to; i++) {
            tmp += i;

        }
        return tmp;
    }
}
