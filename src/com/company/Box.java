package com.company;

public class Box<T extends Figure> {
    public T figure;
    public int someInfo;

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }

    public int getSomeInfo() {
        return someInfo;
    }

    public void setSomeInfo(int someInfo) {
        this.someInfo = someInfo;
    }
}
