package com.company.concurrent;

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentCollectionsMain {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(3);
//
//        List<Integer> synchronizedList =
//                Collections.synchronizedList(integers);

        List<Integer> cowList = new CopyOnWriteArrayList<>(integers);

        Map<String, Integer> map = new HashMap<>();

        ConcurrentMap<String, Integer> cmap =
                new ConcurrentSkipListMap<>();

        Queue<Integer> q = new ConcurrentLinkedQueue<>();

        BlockingQueue<Integer> bq = new SynchronousQueue<>();



    }
}
