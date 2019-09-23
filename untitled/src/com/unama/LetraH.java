package com.unama;

import java.util.Scanner;

public class LetraH {
    public static void main (String[] args){
        double salario;
        float percentual;
        double reajuste;
        Scanner sc = new Scanner(System.in);
       System.out.println("Informe o seu salário: ");
       salario = sc.nextDouble();
       System.out.println("Agora informe o percentual abaixo: ");
       percentual = sc.nextFloat();
       reajuste = (salario * percentual/100);
       System.out.println("O salário reajustado será de: " +reajuste);
    }
}
