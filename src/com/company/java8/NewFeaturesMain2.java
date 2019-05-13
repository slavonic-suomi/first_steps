package com.company.java8;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.*;
import java.util.stream.*;

public class NewFeaturesMain2 {
    public static void main(String[] args) {
        int i = 1 + 1;
        i++;
        int j = i;

        Supplier<Integer> si = () -> 1;

        Consumer<Integer> ci =
                integer -> System.out.println(integer + j);
//        i++;

        Optional<City> city = findCityByName("Minsk1");

        Integer result = city
                .map(city1 -> city1.getName())
                .map(s -> s.length())
                .map(len -> len * 2)
                .orElseGet(() -> 1);
//        .orElseThrow()

        System.out.println(result);


        List<String> strings1 = Stream.of("asd", "qwe", "asd")
                .collect(
                        new Supplier<List<String>>() {
                            @Override
                            public List<String> get() {
                                return new ArrayList<>();
                            }
                        },
                        new BiConsumer<List<String>, String>() {
                            @Override
                            public void accept(List<String> strings, String s) {
                                strings.add(s);
                            }
                        },
                        new BiConsumer<List<String>, List<String>>() {
                            @Override
                            public void accept(List<String> s1, List<String> s2) {
                                s1.addAll(s2);
                            }
                        }

                );

        System.out.println(strings1);

        List<String> strings2 = Stream.of("asd", "qwe", "asd")
                .collect(
                        () -> new ArrayList<>(),
                        (strings, s) -> strings.add(s),
                        (BiConsumer<List<String>, List<String>>) (s1, s2) -> s1.addAll(s2)

                );

        List<String> strings3 = Stream.of("asd", "qwe", "asd")
                .collect(
                        ArrayList::new,
                        List::add,
                        List::addAll
                );

        List<String> strings4 = Stream.of("asd", "qwe", "asd")
                .collect(Collectors.toList());

//        Stream.of("asd", "qwe", "asd").collect(Collectors.joining(", "))

        List<String> cowList
                = new CopyOnWriteArrayList<>(strings4);


        Map<String, Integer> collect = Stream.of("asd", "qwe", "asd")
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length()
                ));

        Stream.of("asd", "qwe", "asd")
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length
                ));

        IntStream.of(1,2,3);
        LongStream.of(1,2,3);
        DoubleStream.of(1,2,3);

//        IntStream.range(1, 100)

//        IntStream.generate(new IntSupplier() {
//            @Override
//            public int getAsInt() {
//                return 0;
//            }
//        });

        DoubleSummaryStatistics statistics = DoubleStream.of(1, 2, 3)
                .summaryStatistics();



//        List<Integer> ints = Arrays.asList(1, 2, 3);
//        ints.stream()
//                .mapToInt(s -> s)



    }

    public static Optional<City> findCityByName(String name) {
        if ("Minsk".equals(name)) {
            return Optional.of(new City("Minsk", 1));
        } else {
            return Optional.empty();
        }
    }
}
