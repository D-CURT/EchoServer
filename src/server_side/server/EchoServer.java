package server_side.server;

import server_side.runnable.MBicicleRunable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer  {
    private int port = 8020;
    private ServerSocket socket;
    private int clientCounter = 0;

    public void serverUp() {
        try {
            socket = new ServerSocket(port);

            while (true) {
                Socket clientSocket = socket.accept();
                new Thread(new MBicicleRunable(clientSocket)).start();
                System.out.print(++clientCounter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public int getClientCounter() {
        return clientCounter;
    }
}
