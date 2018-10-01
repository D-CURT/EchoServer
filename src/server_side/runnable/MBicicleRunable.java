package server_side.runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MBicicleRunable implements Runnable {
    private Socket clientSocket;

    public MBicicleRunable(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {

        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)){

            String input = in.readLine();
            out.println("Client wrote: " + input);
            System.out.println(" talk: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
