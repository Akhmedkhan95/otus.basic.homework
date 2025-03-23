package ru.otus.hw13;

import java.io.*;

public class Client implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public Client(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }

    public String get() throws IOException {
        return inputStream.readUTF();
    }

    public void send(String message) throws IOException {
        outputStream.writeUTF(message);
        outputStream.flush();
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
