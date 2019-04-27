package com.company.concurrent;

import java.util.Random;

public class SleepUtils {
    private static Random r = new Random();

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void sleepRandom(int time) {
        try {
            Thread.sleep(r.nextInt(time) + 20);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
