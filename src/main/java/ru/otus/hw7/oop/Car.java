package ru.otus.hw7.oop;

public class Car implements Transport {

    private int fuel = 50;

    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean canMove(Terrain terrain, int distance) {
        if (distance > fuel*10) {
            System.out.println("Нехватает топлива");
            return false;
        }
        if (Terrain.DENSE_FOREST == terrain || Terrain.SWAMP == terrain) {
            System.out.println("Машина не ездит по данной местности");
            return false;
        }
        System.out.println("Вы преодолели дистанцию");
        return true;
    }
}
