
import java.rmi.Remote;
import java.rmi.RemoteException;

// a remote interface
public interface Mensagem_IF extends Remote {
    String getMensagem() throws RemoteException;
    String saveToTxt(String s) throws RemoteException;
}
