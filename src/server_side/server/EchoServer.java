package server_side.server;

import server_side.runnable.MBicycleRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer  {
    private int port = 8020;
    private ServerSocket socket;

    public EchoServer() {
    }

    public EchoServer(int port) {
        this.port = port;
    }

    public void serverUp() {
        int clientCounter = 0;
        boolean isStart = false;
        try {
            socket = new ServerSocket(port);

            while (true) {
                Socket clientSocket = socket.accept();
                if (!isStart) {
                    System.out.println("Server is active!");
                    isStart = true;
                }
                new Thread(new MBicycleRunnable(clientSocket)).start();
                System.out.print(++clientCounter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
