package com.unama;

import java.util.Scanner;

public class LetraC {

    public static void main(String[] args)
    {
        double base;
        double altura;
        double area;
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe o valor da base: ");
        base = leia.nextDouble();
        System.out.print("Informe o valor da altura: ");
        altura = leia.nextDouble();
        area = (base*altura)/2;
        System.out.print("A area é de "+area+"m²");
    }
}
