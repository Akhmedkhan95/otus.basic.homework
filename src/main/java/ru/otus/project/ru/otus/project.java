package ru.otus.project.ru.otus;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        System.out.println("Какой метод вы хотите вызвать?");
        System.out.println("1 - Greetings");
        System.out.println("2 - CheckSign");
        System.out.println("3 - SelectColor");
        System.out.println("4 - CompareNumbers");
        System.out.println("5 - AddOrSubtractAndPrint");

        int a = sanner.nextInt();
        if (a == 1) {
            Greetings();
        } else if (a == 2) {
            CheckSign((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        } else if (a == 3) {
            SelectColor((int) (Math.random() * 30));
        } else if (a == 4) {
            CompareNumbers((int) (Math.random() * 10), (int) (Math.random() * 10));
        } else if (a == 5) {
            AddOrSubtractAndPrint((int) (Math.random() * 100), (int) (Math.random() * 100), true);
        }

    }

    public static void Greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void CheckSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительна  равна " + sum);
        } else {
            System.out.println("Сумма отрицательна и равна " + sum);
        }
    }

    public static void SelectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void CompareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void AddOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println(result);
    }

}