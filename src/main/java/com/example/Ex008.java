package com.example;

import java.util.Scanner;
import java.util.Locale;

public class Ex008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius:");
        double C = sc.nextDouble();
        double F = 9.0 * C/5.0 + 32.0;
        System.out.printf("O equivalente em Fahrenheit: %.1f\n", F);
        System.out.print("Deseja Repetir (s/n)?");
        char resp = sc.next().charAt(0);

        while(resp == 's'){
            System.out.print("Digite a temperatura em Celsius:");
            C = sc.nextDouble();
            F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("O equivalente em Fahrenheit: %.1f\n", F);
            System.out.print("Deseja Repetir (s/n)?");
            resp = sc.next().toLowerCase().charAt(0);
        }

        sc.close();
    }
}
