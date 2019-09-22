package com.unama;

import java.util.Scanner;

public class LetraA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Cadastro");
        System.out.print("Informe seu nome:");
        nome=sc.nextLine();
        System.out.print("Informe sua idade: ");
        idade=sc.nextInt();
        System.out.print("Seu nome é "+nome+" e sua idade é de "+idade+" anos ");

    }
}
