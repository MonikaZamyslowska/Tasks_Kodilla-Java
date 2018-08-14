package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value;
    public static int EMPTY = -1;
    private List<Integer> elements;

    public SudokuElement() {
        value = EMPTY;
        elements = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getElements() {
        return elements;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
