package ru.otus.java.basik.oop1;

public class Box {
    private int size;
    private String color;
    private boolean isOpened;

    public boolean isOpened() {
        return isOpened;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void open() {
        if (!isOpened) {
            System.out.println("Коробка открыта");
            isOpened = true;
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void close() {
        if (isOpened) {
            System.out.println("Коробка закрыта");
            isOpened = false;
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    public void info() {
        System.out.println("Цвет коробки: " + color + "\nРазмер коробки: " + size + " кубических см");
    }
}