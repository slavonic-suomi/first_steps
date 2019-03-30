package com.company.generics.container;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayContainer<T>
        extends AbstractCollection<T>
        implements Container<T> {

    private T[] array = (T[]) new Object[10];
    private int count = 0;

    @Override
    public boolean add(T element) {
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
        return true;
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
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < count;
            }

            @Override
            public T next() {
                return get(cursor++);
            }
        };
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(array, array.length);
    }

}
