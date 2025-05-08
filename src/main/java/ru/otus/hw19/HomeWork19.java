package ru.otus.hw19;

public class HomeWork19 {
    public static void main(String[] args) {
        BoxGen<Apple> appleBox = new BoxGen<>();
        BoxGen<Orange> orangeBox = new BoxGen<>();
        BoxGen<Fruit> fruitBox = new BoxGen<>();

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        fruitBox.addFruit(new Apple());
        fruitBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками: " + appleBox.weight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());
        System.out.println("Вес смешанной коробки: " + fruitBox.weight());

        System.out.println("Сравнение коробок: " + appleBox.compare(orangeBox));
    }
}
