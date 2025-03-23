package ru.otus.hw13;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        ServerSocket socket = new ServerSocket(1010);
        System.out.println("Сервер запущен!");
        while (true) {
            Socket client = socket.accept();
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            String operations = calculator.getListOperation();
            outputStream.writeUTF(operations);
            String userInput = inputStream.readUTF();
            System.out.println("Пользователь ввел данные: " + userInput);
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Клиент отключился");
                client.close();
                continue;
            }
            String[] dates = parsDateFromClient(userInput);
            double numOne = Double.parseDouble(dates[0]);
            double numTwo = Double.parseDouble(dates[1]);
            String operation = dates[2];
            double res = calculator.calc(numOne, numTwo, operation);
            outputStream.writeUTF(String.valueOf(res));
        }
    }

    public static String[] parsDateFromClient(String date) {
        return date.split(" ");
    }

}
