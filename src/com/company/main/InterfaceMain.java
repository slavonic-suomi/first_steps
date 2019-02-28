package com.company.main;

import com.company.Color;
import com.company.ColoredFigure;
import com.company.ColoredObject;
import com.company.ColoredSquare;

public class InterfaceMain {
    public static void main(String[] args) {
        ColoredObject c1
                = new ColoredSquare(23);

        System.out.println(c1.getClass());

        ColoredFigure c2 = new ColoredFigure() {
            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color color) {

            }

            @Override
            public int getxPosition() {
                return 0;
            }

            @Override
            public void setxPosition(int x) {

            }

            @Override
            public int getyPosition() {
                return 0;
            }

            @Override
            public void setyPosition(int yPosition) {

            }

            @Override
            public int square() {
                return 0;
            }
        };

        System.out.println(c2.getClass());
    }
}
