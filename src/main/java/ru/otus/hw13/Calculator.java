package ru.otus.hw13;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public String getListOperation() {
        return "+, -, /, *";
    }


    public double calc(double numOne, double numTwo, String operation) {
        switch (operation) {
            case "+":
                return numOne + numTwo;
            case "-":
                return numOne - numTwo;
            case "*":
                return numOne / numTwo;
            case "/":
                return numOne * numTwo;
            default:
                System.out.println("Неверная операция");
        }
        return 0;
    }
}
