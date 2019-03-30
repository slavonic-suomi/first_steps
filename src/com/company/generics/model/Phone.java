package com.company.generics.model;

public class Phone extends Product<Phone> {

    private long serialVersionUID = 123;

    private int display;
    private int someVar;
    private int someVar1;

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    @Override
    protected int subCompare(Phone o) {
        return Integer.compare(display, o.display);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Phone phone = (Phone) o;
        return display == phone.display;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "display=" + display +
                "} " + super.toString();
    }
}
