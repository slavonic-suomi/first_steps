package com.company.java8;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class NewFeaturesMain3 {
    public static void main(String[] args) {
        Optional<String> first = Stream
                .of("asd", "qwe", "as", "zxc", "qw")
                .parallel()
                .filter(s -> s.length() == 2)
                .findAny();

        first.ifPresent(System.out::println);

        boolean b = Stream
                .of("asd", "qwe", "as", "zxc", "qw")
                .anyMatch(s -> s.length() < 5);

        Stream
                .of("asd", "qwe", "as", "zxc", "qw")
                .forEach(System.out::println);

        Optional<String> s1 = Stream
                .of("asd", "qwe", "as", "zxc", "qw")
                .reduce((s, s2) -> s + s2);


        Stream<Stream<City>> asd = Stream
                .of(new City("asd", 1))
                .map(s -> s.getNearest().stream());

        Stream<City> asd1 = Stream
                .of(new City("asd", 1))
                .flatMap(s -> s.getNearest().stream())
                .distinct();


    }
}
