package client_side.client_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2Runner {
    public static void main(String[] args) {
        String host = "127.0.0.2";
        int port = 8020;

        try (Socket socket = new Socket(host, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            out.println("Hi there, i`m Sean");
            System.out.println("Server answered: " + in.readLine());
            while (true) {

            }
        } catch (UnknownHostException e) {
            System.out.println("Wrong host!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
