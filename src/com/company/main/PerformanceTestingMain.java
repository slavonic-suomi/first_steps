package com.company.main;

public class PerformanceTestingMain {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int i1 = doSmth(i);
        }

        System.out.println("start");
        long start = System.currentTimeMillis();
        int result = doSmth(1);
        long end = System.currentTimeMillis();

        long diff = end - start;
        System.out.println(diff);
    }

    public static int doSmth(int param) {
        int result = 1;
        for (int i = 0; i < 100_000; i++) {
            for (int j = 0; j < 10000; j++) {
//                for (int k = 0; k < 100_000; k++) {
                result = result * param;
//                }
            }
        }
        return result;
    }
}
