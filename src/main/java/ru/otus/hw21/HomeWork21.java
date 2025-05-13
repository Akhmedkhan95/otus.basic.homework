package ru.otus.hw21;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeWork21 {
    private static final int COUNT = 5;
    private static CountDownLatch latchA = new CountDownLatch(1);
    private static CountDownLatch latchB = new CountDownLatch(1);
    private static CountDownLatch latchC = new CountDownLatch(1);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            try {
                for (int i = 0; i < COUNT; i++) {
                    latchA.await();
                    System.out.print("A");
                    latchA = new CountDownLatch(1);
                    latchB.countDown();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.submit(() -> {
            try {
                for (int i = 0; i < COUNT; i++) {
                    latchB.await();
                    System.out.print("B");
                    latchB = new CountDownLatch(1);
                    latchC.countDown();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.submit(() -> {
            try {
                for (int i = 0; i < COUNT; i++) {
                    latchC.await();
                    System.out.print("C");
                    latchC = new CountDownLatch(1);
                    if (i < COUNT - 1) {
                        latchA.countDown();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                executor.shutdown();
            }
        });

        latchA.countDown();

    }
}
