package com.example;

import java.util.Scanner;

public class Class006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom Dia!");
        }
        else if ( hora < 18){
            System.out.println("Boa Tarde!");
        }
        else {
            System.out.println("Boa Noite!");
        }

        sc.close();
    }
}
