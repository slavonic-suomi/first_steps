package com.company.generics.model;

import java.io.Serializable;

public abstract class Product<T extends Product<T>>
        implements Comparable<T>, Serializable {

    transient private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    protected abstract int subCompare(T o);

    @Override
    public int compareTo(T o) {
        int compare = Integer.compare(price, o.getPrice());
        if (compare == 0) {
            return subCompare(o);
        }
        return compare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product<?> product = (Product<?>) o;
        return price == product.price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }
}
