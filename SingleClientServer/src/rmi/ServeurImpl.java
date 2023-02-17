package tp;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ServeurImpl extends UnicastRemoteObject implements Serveur {
    protected ServeurImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }
    public int fibonnaci(int rang) throws RemoteException {
        if (rang == 0) {
            return 0;
        }
        if (rang == 1) {
            return 1;
        }
        return fibonnaci(rang - 1) + fibonnaci(rang - 2);
    }
    public static void main(String[] args) {
        //System.setSecurityManager(new SecurityManager());
//		System.setProperty("java.security.policy","file./security.policy");

        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);  //lancer le serveur de nommage
            ServeurImpl a = new ServeurImpl();
            Naming.rebind("rmi://localhost/fibo", a); // enregistrer l'objet dans le serveur de nommage
            System.out.println(" HelloServer bound in registry at the url ");
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server failed.\n" + e);
        }
    }


}
