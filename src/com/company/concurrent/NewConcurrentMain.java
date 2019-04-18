package com.company.concurrent;

import java.util.concurrent.*;

public class NewConcurrentMain {
    public static void main(String[] args) {
        ExecutorService executor
                = Executors.newFixedThreadPool(2);


//        executor.submit(new Runnable() {
//            @Override
//            public void run() {
//                SleepUtils.sleep(1000);
//                System.out.println("Task done");
//            }
//        });

        Future<Integer> future1 = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                SleepUtils.sleep(1000);
                System.out.println("Task done");
                return 42;
            }
        });
        Future<Integer> future2 = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                SleepUtils.sleep(1000);
                System.out.println("Task done");
                return 24;
            }
        });

        executor.shutdown();

        try {
            Integer result = future1.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Integer result = future2.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main done");



    }
}
