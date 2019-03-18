package com.company.generics.model;

public class Laptop extends Product<Laptop> {
    private int keyCount;

    public int getKeyCount() {
        return keyCount;
    }

    public void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    @Override
    protected int subCompare(Laptop o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return keyCount == laptop.keyCount;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "keyCount=" + keyCount +
                "} " + super.toString();
    }
}
