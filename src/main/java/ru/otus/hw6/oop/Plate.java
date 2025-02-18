package ru.otus.hw6.oop;

public class Plate {
    private final int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }

    public boolean decreaseFood (int amount) {
        if (amount <= currentFood) {
            currentFood -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "В тарелке " + getCurrentFood() + " еды";
    }

    public void addFood(int amount) {
         currentFood = currentFood + amount;
         if (currentFood > maxFood) {
             currentFood = maxFood;
         }
    }
}
