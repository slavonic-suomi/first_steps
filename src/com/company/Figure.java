package com.company;

public abstract class Figure extends Object {

    public static int counter = 0;
    public static final int defaultX = 0;

    static {
        System.out.println("it's static section");
    }

    private int xPosition;
    public int yPosition;

    public Figure() {
        counter++;
    }

    public Figure(int x, int y) {
        counter++;
        xPosition = x;
        yPosition = y;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("It's done...");
    }

    public int getxPosition() {
        return this.xPosition;
    }

    public void setxPosition(int x) {
        xPosition = x;
    }

    public int getyPosition() {
        return this.yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    abstract int square();

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!this.getClass().equals(o.getClass())) {
            return false;
        }

        Figure f = (Figure) o;

        return this.xPosition == f.xPosition &&
                this.yPosition == f.yPosition;

    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}
