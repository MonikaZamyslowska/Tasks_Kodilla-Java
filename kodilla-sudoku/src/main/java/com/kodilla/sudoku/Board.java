package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import static com.kodilla.sudoku.ResolveSudoku.BOARD_START_INDEX;
import static com.kodilla.sudoku.ResolveSudoku.BOARD_MAX_INDEX;

public class Board extends Prototype{
    private List<Row> rows = new ArrayList<>();

    public Board() {
        for (int i = BOARD_START_INDEX; i < BOARD_MAX_INDEX; i++) {
            rows.add(new Row());
        }
    }

    public List<Row> getBoard() {
        return rows;
    }

    public void setValue(int row, int column, int value) {
            rows.get(row -1).getElement(column).setValue(value);
    }

    public int getValue(int row, int column) {
        return rows.get(row - 1).getElement(column).getValue();
    }

    @Override
    public Board clone() throws CloneNotSupportedException {
        Board clonedBoard = (Board)super.clone();
        clonedBoard.rows = new ArrayList<>();
        for (Row row: rows) {
            Row clonedRow = new Row();
            clonedRow.getRows().clear();
            for (Element element: row.getRows()) {
                Element clonedElement = new Element();
                clonedElement.setValue(element.getValue());
                clonedElement.getPossibleElements().clear();
                clonedElement.getPossibleElements().stream()
                        .forEach(e -> clonedElement.getPossibleElements().add(e));
                clonedRow.getRows().add(clonedElement);
            }
            clonedBoard.getBoard().add(clonedRow);
        }
        return clonedBoard;
    }
}
