package com.company.main;

import com.company.Coordinate;
import com.company.Figure;
import com.company.Rectangle;
import com.company.Square;

public class FigureMain {
    public static void main(String[] args) {

        Square s1 = new Square();
        Figure s2 = s1;

        int someX = 123;

        Coordinate coord = new Coordinate();
        coord.xPosition = 123;
        coord.yPosition = 123;
        s1.setCoordinate(coord);

        System.out.println(coord.yPosition);

        s1.setxPosition(someX);
        s1.setyPosition(1);
//        s1.setCustomY(3);


        System.out.println(s2.getxPosition());
        System.out.println(s2.getyPosition());
        System.out.println(someX);
        Figure r = new Rectangle();

    }
}
