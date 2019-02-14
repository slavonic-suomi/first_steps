package com.company;

public abstract class Figure {

    private Coordinate coordinate;
    private int xPosition;
    public int yPosition;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
        coordinate.yPosition++;
//        coordinate = new Coordinate();
    }

    public int getxPosition() {
        return this.xPosition;
    }

    public void setxPosition(int x) {
        xPosition = ++x;
    }

    public int getyPosition() {
        return this.yPosition;
    }

    public void setyPosition(int y) {
        yPosition = y;
    }

    abstract int square();
}
