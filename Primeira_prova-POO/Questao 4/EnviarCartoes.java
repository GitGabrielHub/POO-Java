package com.gmail.jrf.antoniogabriel;

/**
 * Hello world!
 *
 */
public class EnviarCartoes
{
    public void enviarCartao(Cartao cartao){
        System.out.println(cartao.toString());
    }

    public static void main( String[] args )
    {
        EnviarCartoes app = new EnviarCartoes();

        Cartao c = new CartaoNatalino();
        app.enviarCartao(c);

        c = new CartaoAniversario();
        app.enviarCartao(c);

        c = new CartaoPascoa();
        app.enviarCartao(c);

    }
}
