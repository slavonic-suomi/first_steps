package com.company.concurrent;

import java.util.concurrent.Callable;

public class TransferOperation
        implements Callable<Boolean> {

    private static final Object monitor = new Object();

    private Account from;
    private Account to;
    private int amount;

    public TransferOperation(Account from, Account to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public  Boolean call() throws Exception {
        synchronized (from) {
            SleepUtils.sleepRandom(50);
            synchronized (to) {
                if (from.getAmount() < amount) {
                    System.out.println("not enough money!");
                    return false;
                }
                SleepUtils.sleepRandom(50);
                from.withdraw(amount);
                SleepUtils.sleepRandom(50);
                to.deposit(amount);

                return true;
            }
        }
    }
}
