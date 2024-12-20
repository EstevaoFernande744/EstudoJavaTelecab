package ExResolvidos.ExR001at010;

import java.util.Scanner;

public class ExR009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número!");

        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é Par!", numero);
        }
        else{
            System.out.printf("O número %d é Ímpar!", numero);
        }

        sc.close();
    }
}
