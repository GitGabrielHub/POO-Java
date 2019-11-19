import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Database_IF extends Remote{

    String adiciona(String s) throws RemoteException;
    boolean remove(String s) throws RemoteException;
    boolean busca(String s) throws RemoteException;
    void lista() throws RemoteException;
}
