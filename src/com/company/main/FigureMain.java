package com.company.main;

import com.company.Figure;
import com.company.FigureFactory;
import com.company.Square;

public class FigureMain {
    public static void main(String[] args) {
        Square s1 = new Square(0,0,15);
        Figure s2 = new Square(18);

        s1.setyPosition(234);

        FigureFactory factory = new FigureFactory();
        Square square = factory.createSquare();
        System.out.println(s1);
    }
}
