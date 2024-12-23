package ExResolvidos.ExR011at020;

import java.util.Scanner;

public class ExR019 {

    public static void main(String[] args) {

        System.out.println("Digite um valor inteiro impar entre 0 e 1000:");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % 2 != 0) {
                System.out.println(i);
            }


            sc.close();
        }
    }
}