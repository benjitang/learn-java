package Networking.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class LearnURL {

    public static void main(String[] args) {
        try {
            URL url1 = new URL("http://sample.com:80/index.html");
            URL url2 = new URL("http", "sample.com",80, "index.html");
            System.out.println(url1.getHost());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
