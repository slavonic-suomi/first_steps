package com.company.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncMain {

    private static List<Integer> list = new ArrayList<>();
    private static Object stub = new Object();

//    public static  void doSmth() {
//        synchronized (SyncMain.class) {
//
//        }
//    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        executor.submit(new Runnable() {
            @Override
            public void run() {
                synchronized (list) {
                    for (int i = 0; i < 50; i++) {
                        list.add(i);
                        SleepUtils.sleep(100);
                    }
                }

            }
        });


        executor.submit(new Runnable() {
            @Override
            public void run() {
                SleepUtils.sleep(1000);
                synchronized (list) {
                    for (Integer integer : list) {
                        SleepUtils.sleep(100);
                        System.out.println(integer);
                    }
                }

            }
        });

        executor.shutdown();

    }
}
