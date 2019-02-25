package com.company.main;

import com.company.Figure;
import com.company.Square;

import java.util.regex.Pattern;

public class FigureMain {
    public static void main(String[] args) {
        final int xx = 132;

        Square s1 = new Square(0,0,15);
        Figure s2 = new Square(18);

        s1.setyPosition(234);

        int x = 0;
        Figure s3 = null;

//        Square.doSmth();
//        Figure.doSmth();
//        System.out.println(Figure.counter);
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

        System.out.println(s1);

//        Pattern pattern = Pattern.compile("[+?d]{10}");
    }
}
