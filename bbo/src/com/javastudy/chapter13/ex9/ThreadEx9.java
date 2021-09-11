package com.javastudy.chapter13.ex9;

public class ThreadEx9 {
    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");

        ThreadGroup subGrp1 = new ThreadGroup(grp1,"SubGroup1");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}

            }
        };

        new Thread(grp1, r, "th1");
        new Thread(subGrp1, r, "th2");
        new Thread(grp2, r, "th3");

        System.out.println(">> list of ThreadGroup : " +
                main.getName()
        + ", Active ThreadGroup : " + main.activeGroupCount()
        + ", Active Thread : " + main.activeCount());
    }
}
