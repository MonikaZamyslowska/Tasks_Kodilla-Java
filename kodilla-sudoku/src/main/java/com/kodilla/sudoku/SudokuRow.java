package com.kodilla.sudoku;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuRow {
    private List<SudokuElement> rows = new ArrayList<>();

    public SudokuRow() {
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> rows.add(new SudokuElement()));
    }

    public List<SudokuElement> getRows() {
        return rows;
    }

    public void setRows(List<SudokuElement> rows) {
        this.rows = rows;
    }
}
