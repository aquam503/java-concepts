package formation;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try {
            System.out.println("Waiting for Client......");
            ServerSocket ss=new ServerSocket(5411);
            Socket soc=ss.accept();
            System.out.println("Connection established");
            //read data from socket input stream
            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str=in.readLine();
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            out.println("Server says "+str);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



    }

    }
