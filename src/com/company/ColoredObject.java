package com.company;

import java.io.Serializable;

public interface ColoredObject extends Serializable {

    Color getColor();

    void setColor(Color color);
}
