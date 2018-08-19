package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.Communications.BOARD_MAX_INDEX;
import static com.kodilla.sudoku.Communications.BOARD_START_INDEX;
import static com.kodilla.sudoku.Element.EMPTY;


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
            rows.get(row -1).getColumns().get(column -1).setValue(value);
    }

    public int getValue(int row, int column) {
        return rows.get(row - 1).getColumns().get(column - 1).getValue();
    }

    @Override
    public Board clone() throws CloneNotSupportedException {
        Board clonedBoard = (Board)super.clone();
        clonedBoard.rows = new ArrayList<>();
        for (Row row: rows) {
            Row clonedRow = new Row();
            clonedRow.getColumns().clear();
            for (Element element: row.getColumns()) {
                Element clonedElement = new Element();
                clonedElement.setValue(element.getValue());
                clonedElement.getPossibleElements().clear();
                clonedElement.getPossibleElements().stream()
                        .forEach(e -> clonedElement.getPossibleElements().add(e));
                clonedRow.getColumns().add(clonedElement);
            }
            clonedBoard.getBoard().add(clonedRow);
        }
        return clonedBoard;
    }

    @Override
    public String toString() {
        String a = new String(new char[41]).replace("\0", "\u2500");
        String b = new String(new char[41]).replace("\0", "\u2501");
        String s = " " + b + "\n";
        int x = 0;
        System.out.println("   1   2   3   4   5   6   7   8   9");
        for (int row = BOARD_START_INDEX; row < BOARD_MAX_INDEX; row++) {
            x++;
            s+= x + " \u2551";
            for (int col = BOARD_START_INDEX; col < BOARD_MAX_INDEX; col++) {
                s+= " ";
                int value = getValue(row, col);
                s+= value == EMPTY ? " " : value;
                if (col % 3 == 0) {
                    s+= "\u2502";
                } else {
                    s+= "\u2551";
                }
            }
            s+= " " + "\n";
            if (row < BOARD_MAX_INDEX && row % 3 != 0) {
                s+= " " + a + "\n";
            } else {
                s+= " " + b + "\n";
            }
        }
        return s;
    }
}
