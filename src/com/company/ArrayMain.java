package com.company;

public class ArrayMain {
    public static void main(String[] args) {
        int a[] = new int[3];

        int i = 0;
        while (i < a.length) {
            a[i] = 10 + i;
            i++;
        }

//        do {
//
//        } while (true);

        for (int j = 0; j < a.length ; j++) {

//            System.out.println(a[j]);
        }
        int c[][] = { {1,2}, {3,4,7} };




        int array[] = {-1,2,3,4,5,6};

        int sum = 0;
        for (int x : array) {
            if (x % 2 == 0)
                continue;
            if (x == 7) {
                break;
            }
            sum += x;

//            if (x % 2 != 0) {
//               sum += x;
//            }
        }
        System.out.println(sum);

    }
}
