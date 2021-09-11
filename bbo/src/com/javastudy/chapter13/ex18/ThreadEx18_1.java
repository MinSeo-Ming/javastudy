package com.javastudy.chapter13.ex18;

public class ThreadEx18_1 implements Runnable{
    boolean suspended = false;
    boolean stopped = false;

    Thread th;

    ThreadEx18_1(String name) {
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        String name = th.getName();

        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

        }
        System.out.println(Thread.currentThread().getName() + " - stopped");
    }

    public  void suspend() {
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by suspend()");
    }
    public  void  stop() {
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by stop()");
    }
    public void resume() { stopped =false;}

    public void start() {
        th.start();
    }
}
