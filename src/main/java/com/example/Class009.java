package com.example;

import java.util.Scanner;

public class Class009 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");

        int n1 = 89;
        int n2 = 60;
        int mask = 0b00100000; //32; número 32 em binario e pode ser 0b100000 ignorando os zeros a esquerda
        int n3 = sc.nextInt();

        if((n3 & mask) != 0){
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }

        /*
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        */

        sc.close();
    }
}
