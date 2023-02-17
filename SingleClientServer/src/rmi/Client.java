package tp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        Serveur s;
        try {
            s = (Serveur) Naming.lookup("rmi://127.0.0.1/fibo");
            System.out.println("fibonacci de 5 est: "+s.fibonnaci(5));
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
