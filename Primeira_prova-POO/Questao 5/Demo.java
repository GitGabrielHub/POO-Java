package com.gmail.jrf.antoniogabriel;

public class Demo
{
    public static void main( String[] args )
    {
        System.out.println("============================");
        System.out.println("Fiat");
        Carro carro = new Fiat();
        System.out.println(carro.toString());

        System.out.println("\n============================");
        System.out.println("Fusca");
        carro = new Fusca(false,"branco","tração traseira", "fusquinha");
        System.out.println(carro.toString());
    }
}
