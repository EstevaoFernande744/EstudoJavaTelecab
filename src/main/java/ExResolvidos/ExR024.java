package ExResolvidos;

import java.util.Scanner;

public class ExR024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para saber os divisores:");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
