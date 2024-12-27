package ExResolvidos.Dollar;

import java.util.Scanner;


public class ExR032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço do dolar:");
        double preçoDollar = sc.nextDouble();
        System.out.println("Quantidade que você quer?");
        double valor = sc.nextDouble();
        double resultado = ConversorDollar.dollarToReal(valor, preçoDollar);
        System.out.printf("O valor a se pagar é %.2f!", resultado);

        sc.close();
    }
}
