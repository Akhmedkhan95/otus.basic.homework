package ru.otus.hw19;

public class Apple extends Fruit {
    public Apple() {
        super((int) (Math.random() * (200 - 170 + 1)) + 170);
    }
}
