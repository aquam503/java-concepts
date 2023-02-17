package facortial_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for Client......");
            ServerSocket ss = new ServerSocket(5411);
            Socket soc = ss.accept();
            System.out.println("Connection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Factorial of " + number + " is : " + calculatefactorial(number));
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
    static int calculatefactorial ( int number){
        int f = 1;
        for (int i = 1; i <= number; i++) {
            f = f * i;
        }
        return f;
    }
}
