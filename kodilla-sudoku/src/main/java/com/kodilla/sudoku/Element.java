package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Element {
    private int value;
    public static int EMPTY = -1;

    public Element() {
        value = EMPTY;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
