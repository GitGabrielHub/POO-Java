import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

    private Cliente() {}

    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Database_IF stub = (Database_IF) registry.lookup("operação");
            String resposta = stub.adiciona("Eu");
            System.out.println("resposta: " + resposta);
        } catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }

}
