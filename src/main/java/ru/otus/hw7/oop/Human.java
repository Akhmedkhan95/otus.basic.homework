package ru.otus.hw7.oop;

public class Human {
    private String name;
    private Transport currentTransport;
    private int stamina;
    private boolean isSetTransport;

    public Human(String name, Transport currentTransport, int stamina) {
        this.name = name;
        this.currentTransport = currentTransport;
        this.stamina = stamina;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransport() {
        isSetTransport = true;
    }

    public void outTransport() {
        isSetTransport = false;
    }

    public void driving(int distance, Terrain terrain) {
        if (isSetTransport) {
            if (currentTransport instanceof Bicycle) {
                if(distance > stamina) {
                    return;
                }
                currentTransport.canMove(terrain, distance);
            } else {
                currentTransport.canMove(terrain, distance);
            }
        } else {
            System.out.println(name + " идет пешком");
        }

    }

}
