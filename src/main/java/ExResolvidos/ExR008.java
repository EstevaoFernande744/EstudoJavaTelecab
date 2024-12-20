package ExResolvidos;

import java.util.Scanner;

public class ExR008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número!");

        numero = sc.nextInt();

        if (numero < 0) {
            System.out.printf("O número %d é Negativo!", numero);
        }
        else{
            System.out.printf("O número %d é Positivo!", numero);
        }

        sc.close();
    }
}
