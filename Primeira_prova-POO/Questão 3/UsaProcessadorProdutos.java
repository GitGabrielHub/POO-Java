package com.gmail.jrf.antoniogabriel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class UsaProcessadorProdutos
{
    public static void main( String[] args )
    {
        ArrayList<Produto> listaProdutos = new ArrayList<>(Arrays.asList(
                new Produto(1,"Feijão",68),new Produto(1,"Arroz",100),new Produto(1,"Balse",78),
                new Produto(1,"Prego",91),new Produto(1,"Luva",87),new Produto(1,"Caixa",94),
                new Produto(1,"Molho",83),new Produto(1,"Sal",85),new Produto(1,"Açucar",76),
                new Produto(1,"Farinha",81)
        ));

        ProcessadorProdutos p = new ProcessadorProdutos(listaProdutos);
        p.mostrarGraficoDistribuicaoPrecos();

    }
}
