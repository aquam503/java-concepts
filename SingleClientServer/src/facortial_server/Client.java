package facortial_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try{
            System.out.println("Client started");
            Socket soc=new Socket("localhost",5411);
            //read date from keyboard
            BufferedReader userInpt=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a Number : ");
            int number=Integer.parseInt(userInpt.readLine());
            PrintWriter out =new PrintWriter(soc.getOutputStream(),true);
            out.println(number);
            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
