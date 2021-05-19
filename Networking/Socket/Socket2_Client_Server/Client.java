package Networking.Socket.Socket2_Client_Server;

import java.io.*;
import java.net.*;

public class Client {
    private Socket socket;
    private BufferedReader input;
    private DataOutputStream output;

    public Client(String address, int port){
        try {
            socket = new Socket(address, port);
            System.out.println("connected");
            //ready for input
            input = new BufferedReader(new InputStreamReader(System.in));
            //for output
            output = new DataOutputStream(socket.getOutputStream());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //string to read message from imput
        String line = "";

        //keep reading until stop
        while (!line.equals("stop")){
            try {
                //read the line from the keyboard
                line = input.readLine();
                //write into the outputStream
                output.writeUTF(line);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //close the connection
        try {
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 6666);
    }
}
