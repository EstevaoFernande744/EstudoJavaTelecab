package ExResolvidos;

import java.util.Scanner;

public class ExR025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas:");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            int primeiro = i;
            int segundo = (int)Math.pow(i, 2);
            int terceiro = (int)Math.pow(i, 3);

            System.out.printf("%d %d %d\n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}
