package com.company.main;

import com.company.generics.model.Phone;
import com.company.generics.model.Product;

import java.util.*;

public class CollectionsExampleMain {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();

        integers.add(1);
        integers.add(2);
        integers.add(2);

//        System.out.println(integers);


        List<Product> productList = new LinkedList<>();

        Phone p1 = new Phone();
        p1.setPrice(100);
        Phone p2 = new Phone();
        p2.setPrice(50);
        Phone p3 = new Phone();
        p3.setPrice(300);
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

//        productList.sort();
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return -o1.compareTo(o2);
            }
        });

        System.out.println(productList);


        Map<String, Integer> map = new HashMap<>(500, 1.1f);


        map.put("qwe", 1);
        map.put("dsf", 34);

        Integer qwe = map.get("qwe");

        Map<SomeKey, String> anotherMap = new HashMap<>();

        SomeKey key = new SomeKey();
        key.value = 42;

        anotherMap.put(key, "qqqqqq");
        anotherMap.putIfAbsent(key, "ssssss");

        key.value = 41;
        key.value = 42;

//        System.out.println(anotherMap.get(key));


        Set<Map.Entry<SomeKey, String>> entries = anotherMap.entrySet();

        for (Map.Entry<SomeKey, String> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
        }

//        Queue<Integer> queue = new ArrayDeque<>();
//
//        queue.add(1);
//        queue.offer(1);
//        queue.

    }

    public static class SomeKey {
        public int value;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SomeKey someKey = (SomeKey) o;
            return value == someKey.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }



}
