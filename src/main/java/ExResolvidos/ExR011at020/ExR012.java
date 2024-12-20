package ExResolvidos.ExR011at020;

import java.util.Scanner;

public class ExR012 {

    public static void main(String[] args) {
        System.out.println("Digite o codigo e a quantidade do produto:");
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        if(codigo == 1){
            total = quantidade * 4.00;
        }
        else if(codigo == 2){
            total = quantidade * 4.50;
        }
        else if(codigo == 3){
            total = quantidade * 5.00;
        }
        else if(codigo == 4){
            total = quantidade * 2.00;
        }
        else if(codigo == 5){
            total = quantidade * 1.50;
        }
        else {
            System.out.println("O codigo digitado não esta disponivel!");
            sc.close();
            return;
        }

        System.out.printf("Total a pagar é %.2f", total);

        sc.close();
    }

}
