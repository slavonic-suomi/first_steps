package com.company.java8;

import java.util.concurrent.Callable;

public class NewFeaturesMain {
    public static void main(String[] args) {
        IdRelated.doSmth();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("It's runnable");
            }
        };

        r1.run();

        Runnable r2 = () -> {
            System.out.println("It's runnable");
        };

        Runnable r3 = () -> System.out.println("It's runnable");

        r3.run();

        ParametrizedInt pi1 = new ParametrizedInt() {
            @Override
            public void calculate(int param) {
                System.out.println(param);
            }
        };

        ParametrizedInt pi2 =
            (int param) ->  {
                System.out.println(param);
                System.out.println(param);
            };

        ParametrizedInt pi21 =
                param ->  {
                    System.out.println(param);
                    System.out.println(param);
                };

        ParametrizedInt pi3 = System.out::println;
        ParametrizedInt2 pi42 = pi1::calculate;

        pi3.calculate(123);

    }


    public static interface ParametrizedInt {
        void calculate(int param);
    }

    public static interface ParametrizedInt2 {
        void doSmt(int param);
    }
}
