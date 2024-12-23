package ExResolvidos.ExR011at020;

import java.util.Scanner;

public class ExR020 {

    public static void main(String[] args) {

        System.out.println("Digite a quantidade de números desejados:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        System.out.println("Digite valores para separar-los do intervalo [10,20]:");

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in ++;
            }
            else {
                out ++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
