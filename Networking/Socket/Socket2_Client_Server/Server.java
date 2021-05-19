package Networking.Socket.Socket2_Client_Server;

import java.io.*;
import java.net.*;

public class Server {
    private Socket socket;
    private ServerSocket server;
    private DataInputStream input;

    public Server(int port){
        //start out server and wait for connection
        try {
            server = new ServerSocket(port);
            System.out.println("Server Started");
            System.out.println("Waiting for a client...");

            //we accept the client in the given port and create a socket
            socket = server.accept();
            System.out.println("Client connected.");

            //take input from the client socket
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = "";

            //keep reading from client until stop is sent
            while (!line.equals("stop")){
                try {
                    //read the line from the keyboard
                    line = input.readUTF();
                    System.out.println(line);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("closing connection");

            input.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server(6666);
    }
}
