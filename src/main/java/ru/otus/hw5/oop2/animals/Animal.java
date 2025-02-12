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

    public double run(int distance) {
        int cost = distance;
        if (cost > stamina) {
            System.out.println(this.name + " не может бежать " + distance + " м. Нехватает выносливости.");
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

    public void info() {
        if (tired) {
            System.out.println(name + " устал. Выносливость = " + stamina);
        } else {
            System.out.println(name + " не устал. Выносливости осталось еще " + stamina);
        }
    }
}
