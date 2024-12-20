package com.example;

public class ExR005 {

    public static void main(String[] args) {

        int numero1 = 25;
        int horas1 = 100;
        int numero2 = 1;
        int horas2 = 200;
        int numero3 = 6;
        int horas3 = 145;
        double saldoPorHoras1 = 5.50;
        double saldoPorHoras2 = 20.50;
        double saldoPorHoras3 = 15.55;
        double salarioMensal1;
        double salarioMensal2;
        double salarioMensal3;

        salarioMensal1 = horas1 * saldoPorHoras1;
        salarioMensal2 = horas2 * saldoPorHoras2;
        salarioMensal3 = horas3 * saldoPorHoras3;

        System.out.printf("O número do funcionario é %d\n Trabalou por %d horas\n e seu Salario é: %.2f\n\n",
                numero1, horas1, salarioMensal1);
        System.out.printf("O número do funcionario é %d\n Trabalou por %d horas\n e seu Salario é: %.2f\n\n",
                numero2, horas2, salarioMensal2);
        System.out.printf("O número do funcionario é %d\n Trabalou por %d horas\n e seu Salario é: %.2f\n",
                numero3, horas3, salarioMensal3);


    }

}
