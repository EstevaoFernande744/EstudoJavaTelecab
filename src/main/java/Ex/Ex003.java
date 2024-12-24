package Ex;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        System.out.println("Digite a quantidade e horas utilizadas:");
        Scanner sc = new Scanner(System.in);

        double horaEntrada = sc.nextDouble();
        double horaExtra;
        double valorTotal;

        if (horaEntrada > 100){
            horaExtra = horaEntrada - 100;
            valorTotal = (horaExtra * 2) + 50.00;
            System.out.printf("As horas extras foram %.2f minutos, o valor a se pagar é %.2f", horaExtra, valorTotal);
        }
        else {
            valorTotal = 50.00;
            System.out.printf("Total a pagar %.2f", valorTotal);
        }

        sc.close();
    }
}
