package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Board extends Prototype{
    private List<Row> board = new ArrayList<>();

    public Board() {
        for (int i = 0; i < 9; i++) {
            board.add(new Row());
        }
    }

    public List<Row> getBoard() {
        return board;
    }

    public void setValue(int row, int column, int value) {
            board.get(row -1).getElement(column).setValue(value);
    }

    public int getValue(int row, int column) {
        return board.get(row).getElement(column).getValue();
    }
}
