package com.company.main;

import com.company.*;

public class DisplayManager {

    public static void render(IFigure figure) {
        System.out.println(figure);
    }

    public static void render(ColoredFigure figure) {
        render((IFigure) figure);
        renderColor(figure);
    }

    private static void renderColor(ColoredObject object) {
        System.out.println(object.getColor());
    }

    public static void main(String[] args) {
        Square s1 = new Square(12);
        ColoredSquare s2 = new ColoredSquare(15);

        s2.setColor(Color.GREEN);

        render(s1);
        render(s2);
    }



}
