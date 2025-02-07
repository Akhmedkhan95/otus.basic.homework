package ru.otus.java.basik.oop1;

public class Box {
    private int size;
    private String color;
    private boolean isOpened;
    private String item = "";

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }


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
            System.out.println("Открываю коробку");
            isOpened = true;
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void close() {
        if (isOpened) {
            System.out.println("Закрываю коробку");
            isOpened = false;
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    public void put(String item) {
        if (isOpened && this.item.equals("")) {
            this.item = item;
            System.out.println("Вы положили в коробку " + item);
        } else {
            System.out.println("Коробка закрыта или в ней нет места");
        }
    }

    public void take () {
        if (isOpened && !this.item.equals("")) {
            System.out.println("Теперь в коробке есть место");
        } else if (!isOpened) {
            System.out.println("Коробка закрыта, сначала открой ее");
        }
    }

    public void info() {
        System.out.println("Цвет коробки: " + color + "\nРазмер коробки: " + size + " кубических см");
    }
}