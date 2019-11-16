package com.gmail.jrf.antoniogabriel;

public class Produto {

    private int cod;
    private String descricao;
    private double preco;

    public Produto(int cod, String descricao, double preco) {
        this.setCod(cod);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
