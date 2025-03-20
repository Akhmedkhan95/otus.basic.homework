package ru.otus.hw12;

import jdk.jshell.execution.Util;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class HomeWork12 {
    public static void main(String[] args) {
        findFiles();
        String fileName = processUserInput();
        showFile(fileName);
        writeToFile(fileName);
    }

    public static void findFiles() {
        File directory = new File("src/main/java/ru/otus/hw12");
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                if (file.isFile()) {
                    if (file.getName().endsWith("txt")) {
                        System.out.println(file.getName());
                    }
                }
            }
        }
    }

    public static String processUserInput() {
        System.out.println("Enter filename which you want work");
        return UtilScanner.executeScanner();
    }

    public static void showFile(String fileName) {
        String file = "src/main/java/ru/otus/hw12/" + fileName;
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file))) {
            int n = reader.read();
            while (n != -1) {
                System.out.print((char) n);
                n = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void writeToFile(String fileName) {
        String file = "src/main/java/ru/otus/hw12/" + fileName;
        System.out.println("Введите текст для записи: ");
        String userInput = UtilScanner.executeScanner();
        try (FileOutputStream writer = new FileOutputStream(file, true)) {
            byte[] bytes = userInput.getBytes(StandardCharsets.UTF_8);
            writer.write(bytes);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }

}
