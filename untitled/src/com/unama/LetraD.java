package com.unama;

import java.util.Scanner;

    public class LetraD {

        public static void main(String[] args) {
                double perimetro;
                double raio;
                double area;
                double pi;

                Scanner sc = new Scanner(System.in);
                //Perimetro (2*pi*r)
                //area (pi*raio^2)
                System.out.print("Informe o raio desse círculo: ");
                raio = sc.nextDouble();
                pi = 3.14;
                perimetro = 2*pi*raio;
                area = pi*Math.pow(raio,2);
                System.out.println("O círculo tem perímetro de "+perimetro+"m e sua area é de "+area+"m²");
        }
    }

