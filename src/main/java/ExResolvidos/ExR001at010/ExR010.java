package ExResolvidos.ExR001at010;

import java.util.Scanner;

public class ExR010 {

    public static void main(String[] args) {

        System.out.println("Digite dois números:");

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("São multiplos!");
        }
        else {
            System.out.println("Não são multiplos!");
        }

        sc.close();
    }

}
