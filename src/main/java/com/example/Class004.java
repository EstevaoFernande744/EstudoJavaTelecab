package com.example;

import java.util.Scanner;

public class Class004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        String x;
        int y;
        x = sc.next(); // ler uma palavra
        y = sc.nextInt(); // coloca rum inteiro
        // w = sc.nextDouble() para colocar um número com ponto flutuante (Locale)
        // z = sc.next().charAt(0) pega uma string e dps pega o elemento 0 da string

        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou: " + y);

        String a;
        int b;
        double c;

        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();

        System.out.printf("Os valores são %s, %d, %.2f", a, b, c);


        int j;
        String s1, s2, s3;

        j = sc.nextInt();
        sc.nextLine(); // vai consumir o espaço vazio e vai ocupar ele por termos um next diferente de nextLine
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.printf("Dados digitados: %s, %s, %s\n", s1, s2, s3);

        sc.close();

    }

}
