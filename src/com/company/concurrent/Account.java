package com.company.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private int amount;
    private final Lock lock = new ReentrantLock();

    public Account(int amount) {
        this.amount = amount;
    }

    public Lock getLock() {
        return lock;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void withdraw(int amount) {
        this.amount -= amount;
    }
}
