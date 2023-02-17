import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Server {
        private ArrayList<String> msg=new ArrayList<String>();
        private Random rm=new Random();
        public void setMsg(String s){
            this.msg.add(s);
        }
        public String getMsg(){
            int i=rm.nextInt(msg.size());
            return msg.get(i);
    }
        public static void main(String[] args) throws IOException {
            Server srv=new Server();
            srv.setMsg("p1");
            srv.setMsg("p2");
            srv.setMsg("p3");
            ServerSocket ss=new ServerSocket(5500);
            try{
                while(true){
                    Socket s=ss.accept();
                    System.out.println("New client");
                    PrintWriter out =new PrintWriter(s.getOutputStream());
                    out.println(srv.getMsg());
                    out.flush();
                    System.out.println("Ecriture");
                }
            }finally {ss.close();
        }
    }
}
