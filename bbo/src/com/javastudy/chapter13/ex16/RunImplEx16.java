package com.javastudy.chapter13.ex16;

public class RunImplEx16 implements Runnable{
    boolean suspended = false;
    boolean stopped = false;

    @Override
    public void run() {
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
    public  void suspend() { suspended = true; }
    public  void resume() { suspended = false; }
    public void stop() { stopped =true;}
}
