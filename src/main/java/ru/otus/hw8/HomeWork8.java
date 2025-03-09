package ru.otus.hw8;

import java.io.*;

public class HomeWork8 {
    public static void main(String[] args) throws AppArraySizeException, AppArrayDataException {
        String[][] array = {
                {"1", "2", "3", "5"},
                {"7", "4", "8", "5"},
                {"5", "4", "3", "2"},
                {"9", "8", "7", "6"}
        };

        sumArray(array);
    }

    public static void sumArray(String[][] array) throws AppArrayDataException, AppArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException("Размер массива должен быть 4х4");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }

            }
        }
        System.out.println(sum);
    }
}
