package com.company.main;

import com.company.CustomException;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            double count = count(-1);
            System.out.println(count);
        } catch (Throwable exc) {
            System.out.println("ooops! " + exc.getMessage());
        } finally {
            System.out.println("it's finally!");
        }
        System.out.println("finish!");

    }

    public static double count(int param) {
        if (param < 0) {
            throw new CustomException("param < 0!");
        }
        return Math.pow(param, 0.2);
    }
}
