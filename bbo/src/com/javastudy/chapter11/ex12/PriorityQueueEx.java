package com.javastudy.chapter11.ex12;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3);
        pq.offer(5);
        pq.offer(1);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);

        Object ojt = null;

        while ((ojt = pq.poll()) != null) {
            System.out.println(ojt);
        }
    }
}
