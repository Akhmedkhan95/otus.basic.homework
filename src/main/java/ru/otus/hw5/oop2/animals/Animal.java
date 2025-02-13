package ru.otus.hw5.oop2.animals;

public class Animal {
    String name;
    double speedRun;
    double stamina;
    double speedSwim;
    boolean tired;

    public Animal(String name, double speedRun, double stamina, double speedSwim) {
        this.name = name;
        this.speedRun = speedRun;
        this.stamina = stamina;
        this.speedSwim = speedSwim;
        this.tired = false;
    }

    public double run (int distance) {
        int cost = distance;
        if (cost > stamina) {
            System.out.println(name + " не может пробежать эту дистанцию. Нехватает выносливости");
            tired = true;
            return -1;
        }
        if (speedRun <= 0) {
            System.out.println(name + " не может бежать.");
        }
        double time = distance / speedRun;
        stamina -= cost;
        System.out.println(name + " пробежал " + distance + " м. Выносливости осталось " + stamina);
        return time;
    }

    public int costSwim() {
        return 0;
    }

    public double swim (int distance) {
        int cost = costSwim() * distance;
        if (speedSwim <= 0) {
            System.out.println(name + " не умеет плавать");
            return -1;
        }
        if (cost > stamina) {
            System.out.println(name + " не может проплыть эту дистанцию. Нехватает выносливости");
            tired = true;
            return -1;
        }
        double time = distance/speedSwim;
        stamina -= cost;
        System.out.println(name + " проплыл " + distance + " м. Выносливости осталось " + stamina);
        return time;
    }


    public void info() {
        if (tired) {
            System.out.println(name + " устал. Выносливость = " + stamina);
        } else {
            System.out.println(name + " не устал.");
        }
    }
}
