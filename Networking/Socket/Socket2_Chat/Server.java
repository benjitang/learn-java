package Networking.Socket.Socket2_Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    //to store the connections and users
    public static ArrayList<Socket> connectionArray = new ArrayList<Socket>();
    public static ArrayList<String> currentUsers = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            final int port = 444;
            ServerSocket server = new ServerSocket(port);
            System.out.println("waiting for client...");

            while (true){
                Socket sock = server.accept();
                connectionArray.add(sock);

                System.out.println("Client connected from: " + sock.getInetAddress().getHostName());

                addUserName(sock);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addUserName(Socket s){

    }
}
