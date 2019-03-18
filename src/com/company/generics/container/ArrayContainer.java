package com.company.generics.container;

import java.util.Arrays;

public class ArrayContainer<T> implements Container<T> {

    private T[] array = (T[]) new Object[10];
    private int count = 0;

    @Override
    public void add(T element) {
        if (count == array.length) {
            int newSize = (int) (array.length * 1.5) + 1;
            T[] newArray = (T[]) new Object[newSize];
//            for (int i = 0; i < array.length; i++) {
//                newArray[i] = array[i];
//            }
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[count] = element;
        count++;
    }


    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);

        }

    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(array, array.length);
    }

}
