package tp;

import java.rmi.*;
public interface Serveur extends Remote
{
    public int fibonnaci(int rang) throws RemoteException;
}