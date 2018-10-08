package client_side.client_1;

import client_side.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1Runner {
    public static void main(String[] args) {
        new Client("Max").clientUp();
    }
}
