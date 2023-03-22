package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Produto> list = new ArrayList<Produto>();

        list.add(new Produto(1, "Abacaxi", 1.50));
        list.add(new Produto(2, "Banana", 0.50));
        list.add(new Produto(3, "Laranja", 1.00));
        list.add(new Produto(4, "Doce de leite", 5.00));
        list.add(new Produto(5, "Leite", 2.50));
        list.add(new Produto(6, "Maracujá", 3.50));
        list.add(new Produto(7, "Desodorante", 13.50));

        System.out.println("Bem vindo ao mercadinho do seu Zé.");

        System.out.println("Lista de produtos: ");

        int numb = 0;
        double conta = 0.0;

        Scanner ler = new Scanner(System.in);

        do {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).nome + "  -->  " + list.get(i).valor);
            }
            System.out.println("Selecione um produto de acordo com o número ou digite 8 pra encerrar a compra: ");
            numb = Integer.parseInt(ler.nextLine());

            switch (numb) {
                case 1:
                    System.out.println("Produto selecionado " + list.get(0).nome);
                    conta = conta + list.get(0).valor;
                    System.out.println("valor da compra: " + conta);
                    System.out.println("---------------------");
                    break;
                case 2:
                    System.out.println("Produto selecionado " + list.get(1).nome);
                    conta = conta + list.get(1).valor;
                    System.out.println("valor da compra: " + conta);
                    System.out.println("---------------------");
                    break;
                case 3:
                    System.out.println("Produto selecionado " + list.get(2).nome);
                    conta = conta + list.get(2).valor;
                    System.out.println("valor da compra: " + conta);
                    System.out.println("---------------------");
                    break;
                case 4:
                    System.out.println("Produto selecionado " + list.get(3).nome);
                    conta = conta + list.get(3).valor;
                    System.out.println("valor da compra: " + conta);
                    System.out.println("---------------------");
                    break;
                case 5:
                    System.out.println("Produto selecionado " + list.get(4).nome);
                    conta = conta + list.get(4).valor;
                    System.out.println("valor da compra: " + conta);
                    System.out.println("---------------------");
                    break;
                case 6:
                    System.out.println("Produto selecionado " + list.get(5).nome);
                    conta = conta + list.get(5).valor;
                    System.out.println("valor da compra: " + conta);
                    System.out.println("---------------------");
                    break;
                case 7:
                    System.out.println("Produto selecionado " + list.get(6).nome);
                    conta = conta + list.get(6).valor;
                    System.out.println("valor da compra: " + conta);
                    System.out.println("---------------------");
                    break;
                case 8:
                    numb = 8;
                    break;
            }

        } while (numb != 8);

        System.out.println("Valor final da compra é " + conta);

        ler.close();
    }

    static class Produto {
        int numero;
        String nome;
        double valor;

        public Produto(int numero, String nome, double valor) {
            this.numero = numero;
            this.nome = nome;
            this.valor = valor;
        }
    }
}
