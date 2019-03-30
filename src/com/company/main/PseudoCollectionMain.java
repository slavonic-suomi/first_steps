package com.company.main;

import com.company.generics.container.ArrayContainer;
import com.company.generics.container.Container;
import com.company.generics.container.ListContainer;


public class PseudoCollectionMain {
    public static void main(String[] args) {
        Container<String> container = new ListContainer<>();


        container.add("asd");
        container.add("qwe");
        container.add("zxc");


//        for (int i = 0; i < container.size(); i++) {
//            System.out.println(container.get(i));
//        }

        for (String s : container) {
            System.out.println(s);
        }

        System.out.println(container.contains("asd"));
        container.remove("asd");

//        container.stream()
//                .filter(s -> !s.isEmpty())
//                .map(String::length)
//                .limit(2)
//                .forEach(System.out::println);

    }
}
