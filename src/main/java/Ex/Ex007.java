package Ex;

import java.util.Scanner;

public class Ex007 {

    public static void main(String[] args) {

        System.out.println("Digite um valor de N depois digite valores a serem somados:");
     Scanner sc = new Scanner(System.in);

     int N = sc.nextInt();
     int soma = 0;

     for(int i = 0; i < N ;i++){
        int x = sc.nextInt();
        soma += x;
     }

        System.out.println(soma);

     sc.close();
    }
}
