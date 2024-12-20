package ExResolvidos;

import java.util.Scanner;

public class ExR015 {

    public static void main(String[] args) {

        System.out.printf("Digite o valor do seu salario:");

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double valorImposto;

        if (salario <= 2001.00){
            valorImposto = 0.00;
            System.out.printf("O valor do imposto é 0");
        }
        else if(salario <= 3001.00){
            valorImposto = (salario / 100) * 8;
            System.out.printf("O valor do imposto %.2f", valorImposto);
        }
        else if(salario <= 4500.00){
            valorImposto = (salario / 100) * 18;
            System.out.printf("O valor do imposto %.2f", valorImposto);
        }
        else{
            valorImposto = (salario / 100) * 28;
            System.out.printf("O valor do imposto %.2f", valorImposto);
        }

        sc.close();
    }
}
