package com.company.main;

import com.company.concurrent.Decrementor;
import com.company.concurrent.Incrementor;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadRaceConditionMain {

    public static AtomicInteger counter1 = new AtomicInteger();
    public static AtomicInteger counter2 = new AtomicInteger();



    public static void main(String[] args) throws InterruptedException {

        Decrementor t1 = new Decrementor();
        Incrementor t2 = new Incrementor();

        Thread t3 = new Thread() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Working " + count++ + " sec");

                }

            }
        };



        t1.other = t2;
        t2.other = t1;

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        t3.setDaemon(true);
        t3.start();

        t1.join();
        t2.join();


        System.out.println(t1.result);
        System.out.println(t2.result);
//        int result = counter1.get() + counter2.get();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
//        System.out.println(result);
//
//        int veryLocal = 0;
//        start = System.currentTimeMillis();
//
//        for (int i = 0; i < 1_000_000_000; i++) {
//            for (int j = 0; j < 1000; j++) {
//                veryLocal++;
//                veryLocal--;
//            }
//        }
//
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//        System.out.println(veryLocal);
    }
}
