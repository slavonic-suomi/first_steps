package com.company;

public class Square extends Figure implements Comparable<Square> {

    public static void doSmth() {
        System.out.println("it's static square!");
    }

    int size;

    public Square(int x, int y, int size) {
        super(x,y);
        this.size = size;
        System.out.println("New square!");
    }

    public Square(int size) {
        super();
        this.size = size;
        System.out.println("New square!");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int square() {
        return size * size;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }

        return this.size == ((Square)o).size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Square o) {
        return Integer.compare(o.size, this.size);
    }
}
