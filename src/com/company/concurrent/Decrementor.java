package com.company.concurrent;

import java.util.Random;

public class Decrementor extends Thread {

    public Thread other;
    public int result = 0;

    @Override
    public void run() {
        try {
            int local = 0;

            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                if (Thread.interrupted()) {
                    System.out.println("Decrementor gonna stop");
                    return;
                }

                Thread.sleep(random.nextInt(10));
                local--;
            }

            result = local;

            if (other.isAlive()) {
                other.interrupt();
                System.out.println("Decrementor wins!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
