package com.company.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RaceConditionMain {

    public static void main(String[] args) {
        List<Integer> original = Arrays.asList(3, 4);
        List<Integer> ints = new ArrayList<>(original);

        for (Integer anInt : ints) {
            if (anInt > 3) {
                ints.add(2);
            }
        }

        System.out.println(ints);
    }
}
