package ru.otus.hw8;

public class AppArrayDataException extends RuntimeException {
    public AppArrayDataException ( int row, int col) {
        System.out.println(("В строке " + row + " столбце " + col + " произошла ошибка"));
    }
}
