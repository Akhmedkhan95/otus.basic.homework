package ru.otus.hw13;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 1010)) {
                Client client = new Client(socket.getInputStream(), socket.getOutputStream());
                String dateFromServer = client.get();
                System.out.println("Введите два числа и выберите операцию: (2 4 +) " + dateFromServer);
                String dateToSend = scanner.nextLine();
                if (dateToSend.equalsIgnoreCase("exit")) {
                    client.send(dateToSend);
                    break;
                }
                client.send(dateToSend);
                dateFromServer = client.get();
                System.out.println(dateFromServer);
            } catch (IOException e) {
                System.out.println("client");
                throw new RuntimeException(e);
            }
        }
    }
}
