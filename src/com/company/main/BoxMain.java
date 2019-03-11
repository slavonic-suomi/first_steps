package com.company.main;

import com.company.*;

public class BoxMain {
    public static void main(String[] args) {
        Box<Square> box = new Box<>();

        box.figure = new Square(23);

//        box.figure = new Rectangle();
//        Box rawBox = box;
//        rawBox.setFigure(new Rectangle());

        Square figure = box.getFigure();


        System.out.println(figure);

        LargeBox<Square, Rectangle> largeBox
                = new LargeBox<>();

        largeBox.another = new Rectangle();


    }
}
