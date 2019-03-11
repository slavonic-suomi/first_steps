package com.company;

public class FigureFactory {

    public Square createSquare() {
        return new Square(0);
    }

    public Square createSquare(int size) {
        return new Square(size);
    }

    public Rectangle createRectangle() {
        return new Rectangle();
    }
}
