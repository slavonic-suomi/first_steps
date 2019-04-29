package com.company.java8;

public interface IdRelated extends Comparable<IdRelated>  {

    static void doSmth() {
        System.out.println("asd");
    }

    Integer getId();

    @Override
    default int compareTo(IdRelated o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
