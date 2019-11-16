public class Conta {
    private int numero;
    private  String titular;
    private double saldo;

    public Conta (){
        this.setNumero(0);
        this.setTitular("-- sem nome --");
    }

    public Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }


    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public void setTitular(String titular) {
        if (titular != null) {
            this.titular = titular;
        }
    }

    public void depositar(double quantia){
        if (quantia > 0){
            this.saldo += quantia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void sacar(double quantia){
        if (quantia <= this.getSaldo()){
            this.saldo -= quantia;
        }
    }

    @Override
    public String toString(){
        return "Saldo: " + getSaldo() + "\nTítulo: " + getTitular() + "\nNúmero: " + getTitular();
    }

}
