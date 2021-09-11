package com.javastudy.chapter13.ex11;

import sun.jvm.hotspot.code.CodeBlob;

import java.util.Iterator;
import java.util.Map;

public class ThreadEx11_2 extends Thread {
    ThreadEx11_2 (String name) {
        super(name);
    }

    public void run() {
        Map map = getAllStackTraces();
        Iterator it = map.keySet().iterator();

        int x = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            Thread t = (Thread) obj;

            StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));


            System.out.println("[" + ++x + "] name : " + t.getName()
                + ", group : " + t.getThreadGroup().getName()
                    + ", daemon : " + t.isDaemon()
            );

            for( int i = 0; i < ste.length; i++) {
                System.out.println(ste[i]);
            }

            System.out.println();
        }
    }
}
