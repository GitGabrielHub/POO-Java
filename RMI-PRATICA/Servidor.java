import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Servidor implements Database_IF {

    private String caminho = "/home/teste/Área de Trabalho/Arquivos Java RMI - Alterado/Dados.txt";

    public Servidor(){}

    public String adiciona(String s) throws RemoteException {
        System.out.println("Chamada de método.");

        Path pathOrigem = Paths.get(caminho);
        s+= "\n";

        try {
            Files.write( pathOrigem,
                    s.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND );
        }

        catch (Exception e){}

        return "Adicionado com sucesso.";
    }


    public String remove(String s) throws RemoteException {
        System.out.println("Chamada de método.");
        Path path = Paths.get(caminho);
        List<String> listaJaRemovida= new ArrayList<>();
        try {

            for(String text : Files.readAllLines( path, Charset.defaultCharset() )){
                if(!text.equals(s)) {
                    text+= "\n";
                    listaJaRemovida.add(text);
                }
            }
            Files.delete(path);
            Files.write( path,
                    listaJaRemovida,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND );
        }

        catch (Exception e){}
        return "Removido com sucesso.";
    }

    public StringBuilder busca(String s) throws RemoteException {
        System.out.println("Chamada de método.");
        Path path = Paths.get(caminho);
        StringBuilder data = null;
        try {
            data = new StringBuilder();
            for(String text : Files.readAllLines( path, Charset.defaultCharset() )){
                if(s.equals(text)) data.append("Resultado: ").append(text).append("\n");
            }
            if(data.length() > 1) data.deleteCharAt(data.length()-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public StringBuilder lista() throws RemoteException {
        System.out.println("Chamada de método.");
        Path path = Paths.get(caminho);
        StringBuilder data = null;
        try {
            data = new StringBuilder();
            for(String text : Files.readAllLines( path, Charset.defaultCharset() )){
                data.append(text).append("\n");
            }
            if(data.length() > 1) data.deleteCharAt(data.length()-1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }


    public static void main(String[] args) {

        try {
            Servidor servidor = new Servidor();
            Database_IF stub = (Database_IF) UnicastRemoteObject.exportObject(servidor,0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("operação",stub);

            System.err.println("Servidor iniciado...");
        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }

    }

}

// compilar: [proj-rmi] javac -d bin $(find src -iname "*.java")
// servidor: [proj-rmi] java -classpath bin -Djava.rmi.server.hostname=192.168.15.226 -Djava.rmi.server.codebase=file:bin/ Servidor

