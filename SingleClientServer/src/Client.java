import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("127.0.0.1",5500);
        try{
            BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msg=br.readLine();
            while(msg!=null){
                System.out.println(msg);
                msg=br.readLine();
            }
        }finally {
            s.close();
        }
    }
}
