package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket srv=new ServerSocket(5500);
        while(true){
            Socket s =srv.accept();
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            // int n=Integer.parseInt(br.readLine());
            String str= br.readLine();
            System.out.println(str);
        }
    }
}
