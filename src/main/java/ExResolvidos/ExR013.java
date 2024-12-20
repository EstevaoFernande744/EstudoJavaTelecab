package ExResolvidos;

import java.util.Scanner;

public class ExR013 {

    public static void main(String[] args) {

        System.out.println("Digite um valor entre 0 e 100");

        Scanner sc = new Scanner(System.in);

        double entrada = sc.nextDouble();

        if(entrada < 0.0 || entrada > 100.0){
            System.out.println("Fora de intervalo!");
        }
        else if(entrada <= 25){
            System.out.printf("O valor %.2f encontra-se no intervalo (0, 25]", entrada);
        }
        else if(entrada <= 50){
            System.out.printf("O valor %.2f encontra-se no intervalo (25, 50]", entrada);
        }
        else if(entrada <= 75){
            System.out.printf("O valor %.2f encontra-se no intervalo (50, 75]", entrada);
        }
        else {
            System.out.printf("O valor %.2f encontra-se no intervalo (75, 100]", entrada);
        }

        sc.close();
    }
}
