package ExResolvidos;

import java.util.Scanner;

public class ExR023 {

    public static void main(String[] args) {
        System.out.println("Digite um valor para saber seu número fatorial:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat = 1;

        for(int i = 1; i <= n; i++){
            fat *= i;
        }

        System.out.println(fat);

        sc.close();
    }
}
