package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket s=new Socket("127.0.0.1",5500);
        PrintWriter out =new PrintWriter(s.getOutputStream());
        out.println("hhhhh");
        out.flush();
        }
}
