package com.localspeak.api;

import java.net.ServerSocket;
import java.net.Socket;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;

public class speakserver {
    int port;

    public void Server(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }
        catch (Exception e) {
            System.out.println("An error occured establishing server.");
        }
        
    }
}
