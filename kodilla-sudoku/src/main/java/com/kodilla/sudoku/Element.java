package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Element {
    private int value;
    public static int EMPTY = -1;
    private List<Integer> possibleElements = new ArrayList<>();

    public Element() {
        value = EMPTY;
        for (int i = 0; i <= 9; i++) {
            possibleElements.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleElements() {
        return possibleElements;
    }

    public void setPossibleElements(List<Integer> possibleElements) {
        this.possibleElements = possibleElements;
    }
}
