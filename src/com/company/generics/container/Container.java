package com.company.generics.container;

public interface Container<T> {

    void add(T element);

    T get(int index);

    int size();

    void printAll();

    T[] toArray();

}
