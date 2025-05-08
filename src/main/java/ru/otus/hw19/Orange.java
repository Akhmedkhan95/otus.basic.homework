package ru.otus.hw19;

public class Orange extends Fruit {
    public Orange() {
        super((int) (Math.random() * (250 - 150 + 1)) + 150);
    }
}
