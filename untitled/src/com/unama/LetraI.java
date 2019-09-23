package com.unama;

import java.util.Scanner;

public class LetraI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int compra;
        float desconto;
        double valorTotal;
        System.out.println("Informe o valor da compra: ");
        compra = sc.nextInt();
        System.out.println("Agora informe o desconto: ");
        desconto = sc.nextFloat();
        valorTotal = compra*desconto/100;
        System.out.println("O valor total a ser pago será de: " +valorTotal);
    }
}
