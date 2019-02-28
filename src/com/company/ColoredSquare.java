package com.company;

import java.io.Serializable;

public class ColoredSquare
        extends Square
        implements ColoredFigure, Comparable<ColoredSquare> {

    private Color color;

    public ColoredSquare(int x, int y, int size) {
        super(x, y, size);
    }

    public ColoredSquare(int size) {
        super(size);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int compareTo(ColoredSquare o) {
        int size1 = getSize();
        int size2 = o.getSize();

        return Integer.compare(size1, size2);
    }
}
