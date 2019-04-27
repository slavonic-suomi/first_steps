package com.company.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class SyncrosExampleMain {
    public static void main(String[] args)
            throws InterruptedException,
            BrokenBarrierException {
        Semaphore semaphore = new Semaphore(10);

        semaphore.acquire(3);
        try {
            //do some work
        } finally {
            semaphore.release(3);
        }


        CyclicBarrier cb = new CyclicBarrier(10);
        cb.await();
        cb.reset();


//        CountDownLatch latch = new CountDownLatch(10);
//        latch.


    }
}
