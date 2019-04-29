package com.company.concurrent;

import java.util.Date;

public class Singleton {
    private static volatile Date instance;
    private static final Object mutex = new Object();

    public static  Date getDate() {
        Date result = instance;
        if (result == null) {
           synchronized (mutex) {
               result = instance;
               if (result == null) {
                   //.. do work
                   instance = result = new Date(0);
               }
           }

        }
        return result;
    }
}
