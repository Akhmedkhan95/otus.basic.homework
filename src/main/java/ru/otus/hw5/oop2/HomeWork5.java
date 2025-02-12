package ru.otus.hw5.oop2;

import ru.otus.hw5.oop2.animals.*;

public class HomeWork5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Рыжик", 3, 20, 0);
        Dog dog = new Dog("Вулкан", 5, 100, 1);
        Horse horse = new Horse("Юлий", 10, 300, 2);
        cat.run(150);
        dog.run(500);
        horse.run(1500);
        cat.swim(50);
        dog.swim(10);
        horse.swim(15);
        cat.info();
        dog.info();
        horse.info();
    }
}
