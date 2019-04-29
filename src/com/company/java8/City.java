package com.company.java8;

public class City implements IdRelated, SomeAnotherI {
    private Integer id;

    public City(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(IdRelated o) {
        return IdRelated.super.compareTo(o);
    }

    @Override
    public Integer getId() {
        return id;
    }
}
