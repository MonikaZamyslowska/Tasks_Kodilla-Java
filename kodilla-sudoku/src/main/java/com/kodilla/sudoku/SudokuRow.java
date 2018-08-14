package com.kodilla.sudoku;


import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> rows;

    public SudokuRow() {
        rows = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            rows.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getRows() {
        return rows;
    }
}
