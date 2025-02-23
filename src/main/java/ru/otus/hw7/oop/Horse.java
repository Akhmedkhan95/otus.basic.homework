package ru.otus.hw7.oop;

public class Horse implements Transport {

    private int stamina = 3000;

    public int getStamina() {
        return stamina;
    }

    @Override
    public boolean canMove(Terrain terrain, int distance) {
        if (distance > stamina) {
            System.out.println("Лошади нехватает выносливости");
            return false;
        }
        if (Terrain.SWAMP == terrain) {
            return false;
        }
        System.out.println("Лошадь преодолела данную дистанцию");
        return true;
    }
}
