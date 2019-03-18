package com.company;

import java.io.Serializable;

public class ColoredSquare
        extends Square
        implements ColoredFigure{

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


}
