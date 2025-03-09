package ru.otus.hw8;

public class AppArrayDataException extends RuntimeException {
    private final int row;
    private final int col;

    public AppArrayDataException ( int row, int col) {
        super("Ошибка в ячейке [" + row + "][" + col + "]");
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
