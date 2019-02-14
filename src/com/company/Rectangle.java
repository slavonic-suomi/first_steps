package com.company;

public class Rectangle extends Figure {

    int sizeA = 2;
    int sizeB = 2;

//    @Override
    int square() {
        return sizeA * sizeB;
    }

    public int getSizeA() {
        return sizeA;
    }

    public void setSizeA(int sizeA) {
        this.sizeA = sizeA;
    }

    public int getSizeB() {
        return sizeB;
    }

    public void setSizeB(int sizeB) {
        this.sizeB = sizeB;
    }
//    }



}
