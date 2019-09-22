package com.unama;

import java.util.Scanner;

public class LetraB {
    public static void main(String[] args) {
        int numero;
        int dobro;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número: ");
        numero = scanner.nextInt();
        dobro = numero * 2;
        System.out.println("O dobro de "+numero+ " é "+dobro);
    }
}
