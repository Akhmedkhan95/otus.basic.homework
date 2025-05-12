package ru.otus.hw19;

import java.util.ArrayList;

public class BoxGen<F extends Fruit> {
    private ArrayList<F> fruits = new ArrayList<>();

    public void addFruit (F fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        double startWeight = 0.0;
        for (F fruit : fruits) {
            startWeight += fruit.getWeightFruit();
        }
        return startWeight;
    }

    public boolean compare(BoxGen<?> anotherBox) {
        return Math.abs(this.weight() - anotherBox.weight()) < 0.0001;
    }
    public void transferFruitsTo(BoxGen<F> anotherBox) {
        if (anotherBox == this) {
            return;
        }
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
