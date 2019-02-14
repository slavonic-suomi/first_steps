package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean bol = true;

        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();

        byte b0;
        byte b1 = 127, b2 = 127;

        b0 = (byte) (b1 + b2);

        System.out.println(b0);

        char c = 't' + 1;
        short s1;
        int i = 5;
        long l;
        float f1;
        double d1 = 1.0 / 3;

        if (i >= 5) {
            System.out.println("It's 5 or greater");
            System.out.println("It's 5 or greater");
            System.out.println("It's 5 or greater");
        } else if (i < 0) {
            System.out.println("not...");
        } else {

        }

        switch (i) {
            case 5: {
                System.out.println("it's 5");
                break;
            }
            case 6: {
                System.out.println("it's 6");
                break;
            }
            default:{
                System.out.println("def");
            }
        }


        // System.out.println("Hello world");
    }
}
