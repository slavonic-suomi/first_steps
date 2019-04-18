package com.company.main;

public class MultiThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Start t1");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {}
                System.out.println("Finish t1");
            }
        };


        System.out.println("Start main");
        t1.start();
        t1.join();
        System.out.println("Finish main");





    }
}
