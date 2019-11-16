package com.gmail.jrf.antoniogabriel;

import java.util.StringJoiner;


public class Carro {

    private boolean flex;
    private String  cor;
    private String tracao;
    private String marca;

   //constructor
    public Carro(){
        this(false,"Cor não especificada","Tração não especificada","Marca não especificada");
    }

    public Carro(boolean flex, String cor,String tracao, String marca){
        setCor(cor);
        setFlex(flex);
        setMarca(marca);
        setTracao(tracao);
    }

    //getters and setters
    public boolean isFlex() {
        return flex;
    }
    public String flexStr(){
        if (this.isFlex()){
            return "É flex";
        }

        return "Não é flex";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setFlex(boolean flex) {
        this.flex = flex;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    //toString
    @Override
    public String toString() {
        return new StringJoiner("\n", "", "")
                .add("carro= " + getMarca())
                .add("flex= " + this.flexStr())
                .add("cor= " + this.getCor() )
                .add("tracao= " + this.getTracao())
                .toString();
    }
}
