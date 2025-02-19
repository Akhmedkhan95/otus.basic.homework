package ru.otus.hw6.oop;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        if (appetite < 0) {
            this.appetite = 0;
        } else {
            this.appetite = appetite;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public String toString() {
        String condition;
        if (satiety) {
            condition = "сыт";
        } else {
            condition = "голоден";
        }
        return name + " " + condition;
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetite);
    }
}
