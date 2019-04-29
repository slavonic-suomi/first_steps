package com.company.java8;

public interface SomeAnotherI extends Comparable<IdRelated> {
    @Override
    default int compareTo(IdRelated o) {
        return 0;
    }
}
