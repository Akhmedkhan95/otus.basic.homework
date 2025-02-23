package ru.otus.hw7.oop;

public class Bicycle implements Transport {

    @Override
    public boolean canMove(Terrain terrain, int distance) {
        if(Terrain.SWAMP == terrain) {
            return false;
        }
        System.out.println("Преодолел данную дистанцию");
        return true;
    }
}
