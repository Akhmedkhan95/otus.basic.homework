package ru.otus.hw14;

public class HomeWork14 {
    public static void main(String[] args) throws InterruptedException {
        double[] array = new double[100_000_000];
        long before1 = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long after1 = System.currentTimeMillis();
        System.out.println((after1 - before1) / 1000);

        long before2 = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 25_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 25_000_000; i < 50_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 50_000_000; i < 75_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 75_000_000; i <= 100_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        long after2 = System.currentTimeMillis();
        System.out.println((after2 - before2) / 1000);

    }
}
