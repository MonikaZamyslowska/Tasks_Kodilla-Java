package com.kodilla.sudoku;


import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Element> columns = new ArrayList<>();

    public Row() {
        for (int i = 0; i < 9; i++) {
            columns.add(new Element());
        }
    }

    public List<Element> getColumns() {
        return columns;
    }
}
