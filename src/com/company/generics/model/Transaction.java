package com.company.generics.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transaction {
    private List<Product<?>> products = new ArrayList<>();

    public List<Product<?>> getProducts() {
        return products;
    }

    public void setProducts(List<Product<?>> products) {
        this.products = products;
    }


    public static void main(String[] args) {
        Transaction transaction = new Transaction();

        transaction.getProducts().add(new Phone());

        System.out.println(transaction);
    }
}
