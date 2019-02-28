package com.company;

public enum Color {
    RED(10),
    GREEN(20),
    BLUE(30);

    private final int code;

    Color(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
