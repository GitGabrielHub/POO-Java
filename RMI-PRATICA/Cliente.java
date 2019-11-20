import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {

    private Cliente() {}

    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];
        String texto;
        try {
            System.out.println("Cliente iniciado.");
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Registry registry = LocateRegistry.getRegistry(host);
            Database_IF stub = (Database_IF) registry.lookup("operação");

            int number = scanner.nextInt();
            while (number != 0){
                switch (number){
                    case 1:
                        texto = scanner1.nextLine();
                        System.out.println(stub.adiciona(texto));
                        break;

                    case 2:
                        texto = scanner1.nextLine();
                        System.out.println(stub.remove(texto));
                        break;

                    case 3:
                        texto = scanner1.nextLine();
                        System.out.println(stub.busca(texto));
                        break;

                    case 4:
                        System.out.println(stub.lista());
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

                number = scanner.nextInt();

            }
            System.out.println("Programa encerrado.");
        } catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }

}

//java -classpath . Cliente 192.168.15.226
