package com.example;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {
        System.out.println("Digite valores diferentess de 0.");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while(x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.printf("O valor da soma dos números é %d", soma);

     sc.close();
    }
}
