package com.company.generics;

import com.company.generics.container.ArrayContainer;
import com.company.generics.container.Container;
import com.company.generics.model.Laptop;
import com.company.generics.model.Phone;
import com.company.generics.model.Product;

public class ContainerMain {
    public static void main(String[] args) {
        Container<Product> products = new ArrayContainer<>();
        Container<Laptop> laptops   =  new ArrayContainer<>();

        Laptop laptop = new Laptop();
        laptops.add(laptop);

//        products = laptops; //compile error, can't cast Container<Laptop> to Container<Product>

        boolean phoneInLaptops  = exists1(laptops, new Phone()); //works, but allow different types
        boolean laptopInLaptops = exists2(laptops, laptop); //allow only same types

        copy1(laptops, products); // copy Container<Laptop> laptops into Container<Product> or Container<Object>

        ArrayContainer<Laptop> target = new ArrayContainer<>();
        copy2(laptops, target);  // copy  Container<Laptop> only into Container<Laptop>
    }

    public static boolean exists1(
            Container<? extends Product> container, Product product) {
        for (int i = 0; i < container.size(); i++) {
            Product element = container.get(i);
            if (element.equals(product)) {
                return true;
            }
        }

        return false;
    }

    public static <T extends Product> boolean exists2(
            Container<T> container, T product
    ) {

        for (int i = 0; i < container.size(); i++) {
            T element = container.get(i);
            if (element.equals(product)) {
                return true;
            }
        }

        return false;
    }

    public static void copy1(
            Container<? extends Product> source,
            Container<? super Product> target) {
        for (int i = 0; i < source.size(); i++) {
            Product element = source.get(i);
            target.add(element);
        }
    }

    public static <T extends Product> void copy2(
            Container<T> source,
            Container<T> target) {
        for (int i = 0; i < source.size(); i++) {
            T element = source.get(i);
            target.add(element);
        }
    }
}
