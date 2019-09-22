package com.unama;

import java.util.Scanner;

public class LetraF {
    public static void main (String[] args){
        double preco;
        int quantidade;
        double valorTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preço do produto selecionado: ");
        preco = sc.nextDouble();
        System.out.println("Agora informe a quantidade selecionada desse produto: ");
        quantidade = sc.nextInt();
        valorTotal = preco*quantidade;
        System.out.println("O valor pago será de: " +valorTotal);
    }
}
