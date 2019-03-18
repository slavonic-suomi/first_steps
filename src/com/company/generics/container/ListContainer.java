package com.company.generics.container;


public class ListContainer<T> implements Container<T> {

    private int count = 0;
    private Node<T> head;

    @Override
    public void add(T element) {
        Node<T> node = new Node<>();
        node.element = element;

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }

        count++;

    }

    @Override
    public T get(int index) {
        int count = 0;
        Node<T> node = head;
        while (count < index) {
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


}
