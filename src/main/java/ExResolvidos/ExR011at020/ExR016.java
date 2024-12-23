package ExResolvidos.ExR011at020;

import java.util.Scanner;

public class ExR016 {

    public static void main(String[] args) {

        System.out.println("Digite a senha correta:");

        Scanner sc = new Scanner (System.in);

        double senha = 2002;
        double entrada = sc.nextDouble();

        while(entrada != senha) {
            System.out.println("senha invalida!");
            entrada = sc.nextDouble();
        }

        System.out.println("Acesso Permitido!");

        sc.close();
    }
}
