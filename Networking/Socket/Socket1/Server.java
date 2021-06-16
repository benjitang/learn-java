package Networking.Socket.Socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.runServer();
    }

    public void runServer() throws IOException {
        ServerSocket svsocket = new ServerSocket(444);
        Socket sock = svsocket.accept();
        InputStreamReader ir = new InputStreamReader(sock.getInputStream());
        BufferedReader br = new BufferedReader(ir);

        String message = br.readLine();
        System.out.println(message);

        if (message != null){
            PrintStream ps = new PrintStream(sock.getOutputStream());
            ps.println("message received!");
        }
    }
}
