package server_side.runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MBicicleRunnable implements Runnable {
    private Socket clientSocket;

    public MBicicleRunnable(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {

        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)){

            String input = in.readLine();
            out.println(input);
            System.out.println(" client says: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
