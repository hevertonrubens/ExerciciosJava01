package com.unama;

import java.util.Scanner;

public class LetraG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float largura;
        float comprimento;
        float area;

        System.out.println("Informe as medidas: ");
        System.out.print("Largura:");
        largura = sc.nextFloat();
        System.out.print("Comprimento:");
        comprimento = sc.nextFloat();
        area = (largura * comprimento);
        System.out.println("A área dessa sala será de " + area + "m²");
    }
}
