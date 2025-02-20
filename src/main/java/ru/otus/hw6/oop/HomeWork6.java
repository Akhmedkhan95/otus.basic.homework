package ru.otus.hw6.oop;

public class HomeWork6 {
    public static void main(String[] args) {

        Plate plate = new Plate(40);

        Cat scar = new Cat("Шрам", 20);
        Cat sharkhan = new Cat("Шархан", 25);

        Cat[] cats = {scar, sharkhan};
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.addFood(50);
    }
}
