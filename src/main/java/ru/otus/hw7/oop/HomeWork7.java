package ru.otus.hw7.oop;

public class HomeWork7 {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bicycle = new Bicycle();
        Transport horse = new Horse();
        Transport rover = new Rover();

        Human john = new Human("John", car, 100);

        john.setTransport();
        john.driving(300, Terrain.PLAIN);
        john.driving(200, Terrain.SWAMP);
    }
}
