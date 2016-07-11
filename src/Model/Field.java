package Model;

/**
 * Created by VKanunnikov on 11.07.2016.
 */
public class Field {

    public static final int MAX_AMOUNT_OF_SHIPS = 10;
    public static final int SIZE = 10;
    private Cell[][] cells;

    public Cell[][] getCells() {
        return cells;
    }

    public Field() {
        makeEmptyField();
    }

    private void makeEmptyField() {
        cells = new Cell[SIZE][SIZE];
        for (Cell[] cell : cells) {
            for (Cell cell1 : cell) {
                cell1 = Cell.EMPTY;
            }
        }
    }

    private void clearField() {
    }


    public static enum Cell {
        EMPTY,
    }

}
