package com.unama;

import java.util.Scanner;

public class LetraJ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float real;
        double totalemdolar;
        System.out.println("Informe um valor: R$");
        real = sc.nextFloat();
        totalemdolar = real/4.15;
        System.out.println("O valor em dólar será de: U$S" +totalemdolar);
    }
}
