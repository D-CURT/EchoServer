package server_side;

import server_side.server.EchoServer;

public class ServerRunner {

    public static void main(String[] args) {
        System.out.println("Starting a server!");
        new EchoServer().serverUp();
    }
}
