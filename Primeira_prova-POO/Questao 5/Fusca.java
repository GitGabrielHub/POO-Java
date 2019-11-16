package com.gmail.jrf.antoniogabriel;

import java.util.StringJoiner;

public class Fusca extends Carro{
    int quantPortas = 4;

    public Fusca (boolean flex, String cor,String tracao, String marca){
        super(flex,cor,tracao,marca);
    }

    public Fusca(){
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
