package ru.otus.hw5.oop2.animals;

public class Cat extends Animal {
    public Cat(String name, double speedRun, double stamina, double speedSwim) {
        super(name, speedRun, stamina, speedSwim);
    }
    @Override
    public int costSwim () {
        return 0;
    }
}