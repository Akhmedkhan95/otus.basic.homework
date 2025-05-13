package ru.otus.hw20;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HomeWork20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите искомую последовательность символов: ");
        String sequence = scanner.nextLine();

        try {
            int count = countSequenceOccurrences(fileName, sequence);
            System.out.println("Последовательность '" + sequence + "' встречается " + count + " раз(а)");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        scanner.close();
    }

    public static int countSequenceOccurrences(String fileName, String sequence) throws IOException {
        if (sequence.isEmpty()) {
            return 0;
        }

        int count = 0;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {

            char[] sequenceChars = sequence.toCharArray();
            int sequenceLength = sequenceChars.length;
            int currentPosition = 0;
            char[] buffer = new char[sequenceLength];
            int read;

            while ((read = reader.read(buffer, currentPosition, sequenceLength - currentPosition)) != -1) {
                currentPosition += read;

                if (currentPosition == sequenceLength) {
                    if (arraysEqual(buffer, sequenceChars)) {
                        count++;
                    }

                    System.arraycopy(buffer, 1, buffer, 0, sequenceLength - 1);
                    currentPosition = sequenceLength - 1;
                }
            }
        }

        return count;
    }

    private static boolean arraysEqual(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
