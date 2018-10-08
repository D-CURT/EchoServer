package client_side;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private String name;
    private String host = "127.0.0.1";
    private int port = 8020;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void clientUp() {
        try (Socket socket = new Socket(host, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            out.println("Hi there, i`m " + name);
            System.out.println("Server answered: " + in.readLine());
            /*while (true) {

            }*/
        } catch (UnknownHostException e) {
            System.out.println("Wrong host!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
