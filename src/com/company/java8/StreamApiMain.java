package com.company.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,6,7,3,4,5);

        String s1 = list.stream()
                .filter(i -> i > 2)
                .sorted(Comparator.reverseOrder())
                .map(i -> "and " + i)
                .collect(Collectors.joining(", "));

        System.out.println(s1);

//        Stream<Integer> is1 = list.stream();
//        Stream<Integer> is2 = is1.filter(i -> i > 2);
//        Stream<Integer> is3 = is2.sorted(Comparator.reverseOrder());
//        Stream<String>  is4 = is3.map(i -> "and " + i);
//        String s2 = is4.collect(Collectors.joining(", "));
//
//        is4.collect(Collectors.toList());
//        System.out.println(s2);





    }
}
