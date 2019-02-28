package com.company.main;

import com.company.Color;

import java.util.Arrays;

public class StringMain2 {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = new String("asd");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        Color c1 = Color.GREEN;


        System.out.println(Color.RED.ordinal());
        System.out.println(Color.GREEN.ordinal());
        System.out.println(Color.BLUE.ordinal());

        Color[] values = Color.values();

        System.out.println(Arrays.toString(values));

    }
}
