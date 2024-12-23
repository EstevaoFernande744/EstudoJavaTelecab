package ExResolvidos.ExR011at020;

import java.util.Scanner;

public class ExR021 {

    public static void main(String[] args) {
        System.out.println("Digite o número de vezes que ira se repetir:");
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5)/10;

            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}
