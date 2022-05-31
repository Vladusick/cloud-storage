package ru.samoshchenko.cloud.storage.cloudapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Network {

    private DataInputStream is;
    private DataOutputStream os;


    public Network(int port) throws IOException {
        Socket socket = new Socket("localhost", port);
        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());
    }

    public String readString() throws IOException {
        return is.readUTF();
    }

    public int readInt() throws IOException {
        return is.readInt();
    }

    public void writeMessage(String message) throws IOException {
        os.writeUTF(message);
        os.flush();
    }

    public DataInputStream getIs() {
        return is;
    }

    public DataOutputStream getOs() {
        return os;
    }
}
