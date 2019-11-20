import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Database_IF extends Remote{

    String adiciona(String s) throws RemoteException;
    String remove(String s) throws RemoteException;
    StringBuilder busca(String s) throws RemoteException;
    StringBuilder lista() throws RemoteException;
}
