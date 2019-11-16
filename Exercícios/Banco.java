import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> listaConta;


    Banco(){
        listaConta = new ArrayList<Conta>();
    }

    public boolean cadastrarConta(int n, String t, double s){
        if (buscarConta(n)) return false;

        Conta conta = new Conta(n,t,s);
        return listaConta.add(conta);
    }

    public boolean buscarConta (int numero){
        if(listaConta == null) return false;

        for (int i = 0; i < quantidadeContas(); i++){
            if(listaConta.get(i).getNumero() == numero) return true;
        }

        return false;
    }

    public int quantidadeContas(){
        return listaConta.size();
    }

}
