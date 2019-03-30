package com.company.generics.container;


import java.util.AbstractCollection;
import java.util.Iterator;

public class ListContainer<T>
        extends AbstractCollection<T>
        implements Container<T> {

    private int count = 0;
    private Node<T> head;

    @Override
    public boolean add(T element) {
        Node<T> node = new Node<>();
        node.element = element;

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }

        count++;
        return true;

    }

    @Override
    public T get(int index) {
        int count = 0;
        Node<T> node = head;
        while (count < this.count - index - 1 ) {
            node = node.next;
            count++;
        }
        return node.element;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void printAll() {
        if (head != null) {
            Node<T> node = head;
            do {
                System.out.println(node.element);
                node = node.next;
            } while (node != null);
        }

    }

    private static class Node<T> {
        T element;
        Node<T> next;
    }

    @Override
    public T[] toArray() {
        if (head == null) {
            return (T[]) new Object[0];
        } else {
            Node<T> node = head;
            T[] result = (T[]) new Object[count];
            for (int i = 0; i < count; i++) {
                result[i] = node.element;
                node = node.next;
            }

            return result;
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
}
