package ExResolvidos.ExR011at020;

import java.util.Scanner;

public class ExR015 {

    public static void main(String[] args) {

        System.out.printf("Digite o valor do seu salario:");

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double valorImposto;

        if (salario <= 2000.00){
            valorImposto = 0.00;
        }
        else if(salario <= 3000.00){
            valorImposto = (salario - 2000.0) * 0.08;
        }
        else if(salario <= 4500.00){
            valorImposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else{
            valorImposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if(valorImposto == 0.00) {
            System.out.printf("O valor do imposto é 0");
        }
        else {
            System.out.printf("O valor do imposto %.2f", valorImposto);
        }

        sc.close();
    }
}
