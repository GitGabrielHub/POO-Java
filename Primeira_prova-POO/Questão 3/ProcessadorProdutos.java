package com.gmail.jrf.antoniogabriel;

import java.util.ArrayList;

public class ProcessadorProdutos {
    ArrayList<Produto> lista;

    ProcessadorProdutos(ArrayList<Produto> lista){
        this.lista = lista;
    }

    public void mostrarGraficoDistribuicaoPrecos(){

        double menor = 999;
        double maior = 0;
        int i;
        double media = 0;

        for ( i = 0; i <= 10; i++) {

            if(i == 10){
                System.out.printf("  100:");
            }

            else{
                System.out.printf("%d0-%d9:",i,i);
            }


            for (Produto p: this.lista) {

                if(p.getPreco() <= 10 *(i+1) - 1 && p.getPreco() >= 10*i){
                    System.out.printf(" +");
                }
            }
            System.out.println();


        }

        for (Produto p: this.lista) {

            if(p.getPreco() > maior){
                maior = p.getPreco();
            }

            if(p.getPreco() < menor){
                menor = p.getPreco();
            }

            media += p.getPreco();
        }

        System.out.println("Menor preço: " + menor);
        System.out.println("Maior preço: " + maior);
        System.out.println("Média dos preços: " + (media / this.lista.size()));
    }
}
