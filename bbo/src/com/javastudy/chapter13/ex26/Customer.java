package com.javastudy.chapter13.ex26;




public class Customer implements Runnable{
    private Table table;
    private String food;
    Customer(Table table, String food ) {
        this.table = table;
        this.food = food;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {}

            String name = Thread.currentThread().getName();

            table.remove(food);

                System.out.println(name + "failed to eat : (");
        }
    }

}
