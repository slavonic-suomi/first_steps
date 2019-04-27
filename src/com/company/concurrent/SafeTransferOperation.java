package com.company.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SafeTransferOperation
        implements Callable<Boolean> {

    private Random random = new Random();

    private Account from;
    private Account to;
    private int amount;

    public SafeTransferOperation(Account from, Account to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public  Boolean call() throws Exception {
        if (from.getLock().tryLock(random.nextInt(300), TimeUnit.MILLISECONDS)) {
            try {
                SleepUtils.sleepRandom(50);
                if (to.getLock().tryLock(random.nextInt(300), TimeUnit.MILLISECONDS)) {
                    try {
                        if (from.getAmount() < amount) {
                            System.out.println("not enough money!");
                            return false;
                        }
                        SleepUtils.sleepRandom(50);
                        from.withdraw(amount);
                        SleepUtils.sleepRandom(50);
                        to.deposit(amount);
                        return true;
                    } finally {
                        to.getLock().unlock();
                    }
                } else {
                    System.out.println("can't get lock");
                    return false;
                }
            } finally {
                from.getLock().unlock();
            }
        } else {
            System.out.println("can't get lock");
            return false;
        }

    }
}
