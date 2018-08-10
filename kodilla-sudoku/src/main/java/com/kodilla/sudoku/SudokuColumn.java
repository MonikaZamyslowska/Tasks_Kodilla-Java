package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuColumn {
    private List<SudokuRow> cols = new ArrayList<>();

    public SudokuColumn() {
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> cols.add(new SudokuRow()));
    }

    public List<SudokuRow> getCols() {
        return cols;
    }

    public void setCols(List<SudokuRow> cols) {
        this.cols = cols;
    }
}
