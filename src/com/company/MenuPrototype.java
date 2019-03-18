package com.company;

import com.company.generics.container.Container;

public class MenuPrototype<T> {

//    private Factory<T> factory;
    private Container<T> container;

    void printHelp() {
        System.out.println("1 to add");
    }

    void run() {
        while (true) {
            printHelp();
            //user input
            int item = 4;
            switch (item) {
                case 1: {

                }
            }

        }
    }
}
