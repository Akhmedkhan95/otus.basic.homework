package ru.otus.project.ru.otus;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        System.out.println("Какой метод вы хотите вызвать?");
        System.out.println("1 - greetings");
        System.out.println("2 - checkSign");
        System.out.println("3 - selectColor");
        System.out.println("4 - compareNumbers");
        System.out.println("5 - addOrSubtractAndPrint");

        int a = sanner.nextInt();
        if (a == 1) {
            greetings();
        } else if (a == 2) {
            checkSign((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        } else if (a == 3) {
            selectColor((int) (Math.random() * 30));
        } else if (a == 4) {
            compareNumbers((int) (Math.random() * 10), (int) (Math.random() * 10));
        } else if (a == 5) {
            addOrSubtractAndPrint((int) (Math.random() * 100), (int) (Math.random() * 100), true);
        }

    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительна  равна " + sum);
        } else {
            System.out.println("Сумма отрицательна и равна " + sum);
        }
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println(result);
    }

}