package br.edu.ifpb;

import java.util.Scanner;
import java.util.StringJoiner;

public class Menu {

    public void mostrarMenu(){
        Conversor conversor = new Conversor();
        String menu = new StringJoiner("\n", "","")
                .add("1 - Converter pra binário")
                .add("2- Converter pra hexadecimal")
                .add("3- Para sair").toString();

        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        String escolha = "Digite sua opção: ";
        String decimal_text = "Digite o número decimal: ";
        int opcao;

        System.out.print(escolha);
        opcao = scanner.nextInt();
        while(opcao != 3){
            switch (opcao){
                case 1:
                    System.out.print(decimal_text);
                    System.out.println(conversor.converterBin(scanner.nextInt()));
                    break;

                case 2:
                    System.out.print(decimal_text);
                    System.out.println(conversor.converterHex(scanner.nextInt()));
                    break;

                default:
                    System.out.println("Opção inválida");
                    System.out.println(menu);
            }

            System.out.print(escolha);
            opcao = scanner.nextInt();
        }

    }
}
