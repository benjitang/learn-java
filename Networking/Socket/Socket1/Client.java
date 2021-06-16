package Networking.Socket.Socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.runClient();
    }

    public void runClient() throws IOException {
        Socket sock = new Socket("localhost", 444);
        PrintStream ps = new PrintStream(sock.getOutputStream());
        ps.println("hello to server from client");

        InputStreamReader ir = new InputStreamReader(sock.getInputStream());
        BufferedReader br = new BufferedReader(ir);

        String message = br.readLine();
        System.out.println(message);
    }
}
