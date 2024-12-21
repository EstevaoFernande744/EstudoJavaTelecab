package com.example;

import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {

        System.out.println("Digite um valor de 1 a 7:");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        // String dia;

        if (numero == 1){
            System.out.println("Domingo!");
            // dia = "domingo";
        }
        else if (numero == 2){
            System.out.println("Segunda-Feira!");
        }
        else if (numero == 3){
            System.out.println("Terça-Feira!");
        }
        else if (numero == 4){
            System.out.println("Quarta-Feira!");
        }
        else if (numero == 5){
            System.out.println("Quinta-Feira!");
        }
        else if (numero == 6){
            System.out.println("Sexta-Feira!");
        }
        else if (numero == 7){
            System.out.println("Sábado!");
        }
        else {
            System.out.println("Número invalido!");
        }

        // System.out.println(dia);

     sc.close();
    }
}
