package com.company.java8;

import java.util.List;
import java.util.Optional;

public class City implements IdRelated, SomeAnotherI {
    private Integer id;
    private String name;
    private List<City> nearest;
    private Optional<String> countryName = Optional.empty();

    public City(String name, Integer id) {
        this.id = id;
        this.name = name;
    }

    public List<City> getNearest() {
        return nearest;
    }

    @Override
    public int compareTo(IdRelated o) {
        return IdRelated.super.compareTo(o);
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
