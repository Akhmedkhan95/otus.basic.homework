package ru.otus.hw7.oop;

public class Rover implements Transport {

    int fuel = 100;

    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean canMove(Terrain terrain, int distance) {
        if (distance > fuel*10) {
            return false;
        }
        System.out.println("Преодолел данную дистанцию");
        return true;
    }
}
