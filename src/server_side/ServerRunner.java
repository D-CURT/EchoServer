package server_side;

import server_side.server.EchoServer;

public class ServerRunner {

    public static void main(String[] args) {
        System.out.println("Hello, server!");
        EchoServer server = new EchoServer();
        server.serverUp();
        System.out.println(server.getClientCounter());
    }
}
