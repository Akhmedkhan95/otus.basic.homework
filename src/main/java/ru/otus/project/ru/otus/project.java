package ru.otus.project.ru.otus;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        Greetings();
        CheckSign(3, 7, 6);
        SelectColor(15);
        CompareNumbers(7, 10);
        AddOrSubtractAndPrint(18, 14, true);
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
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void SelectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 || data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
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
        if (increment) {
            int result = initValue + delta;
            System.out.println(result);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }

    }

}
