package com.kodilla.sudoku;


import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Element> rows = new ArrayList<>();

    public Row() {
        for (int i = 0; i < 9; i++) {
            rows.add(new Element());
        }
    }

    public Element getElement(int elementIndex) {
        return rows.get(elementIndex -1);
    }

    public List<Element> getRows() {
        return rows;
    }
}
