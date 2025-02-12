package ru.otus.hw5.oop2;

import ru.otus.hw5.oop2.animals.Cat;
import ru.otus.hw5.oop2.animals.Dog;
import ru.otus.hw5.oop2.animals.Horse;

public class HomeWork5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Рыжик", 3, 20, 0);
        Dog dog = new Dog("Вулкан", 5, 100, 1);
        Horse horse = new Horse("Юлий", 10, 200, 2);
        cat.run(15);
        dog.run(50);
        horse.run(150);
        cat.info();
        dog.info();
        horse.info();
    }
}
