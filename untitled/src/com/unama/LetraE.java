package com.unama;

import java.util.Scanner;

public class LetraE {
    public static void main(String[] args) {
        int vendas;
        double comissao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade total de vendas: ");
        vendas = sc.nextInt();
        comissao = vendas*0.10;
        System.out.println("A comissão foi de: " +comissao);
    }

}
