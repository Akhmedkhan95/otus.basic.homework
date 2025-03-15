package ru.otus.hw7.oop;

public class Human {
    private String name;
    private Transport currentTransport;
    private int stamina;

    public Human(String name, int stamina) {
        this.name = name;
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

    public void setTransport (Transport transport) {
        currentTransport = transport;
    }

    public void outTransport () {
        currentTransport = null;
    }


    public void driving(int distance, Terrain terrain) {
        if (currentTransport != null) {
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
