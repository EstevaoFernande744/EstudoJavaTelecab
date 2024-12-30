package VendaDeCarro;

import java.util.Scanner;

public class test01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Venda vc = new Venda();

        int diaDasEleicoes = 26;
        int mesDasEleicoes = 10;
        int anoDasEleicoes = 2026;

        System.out.println("Digite sua idade: ");
        double idade = sc.nextDouble();
        System.out.println();

        if (idade >= 18) {
            System.out.println("Você já pode votar!");
        }
        else if(idade >= 16){

            System.out.printf("A data das eleições é %d/%d/%d", diaDasEleicoes, mesDasEleicoes, anoDasEleicoes);
            System.out.println();

            System.out.println("Digite o ano do seu nascimento: ");
            int anoNascimento = sc.nextInt();
            System.out.println();

            System.out.println("Digite o mês do seu nascimento: ");
            int mesNascimento = sc.nextInt();
            System.out.println();

            System.out.println("Digite o dia do seu nascimento: ");
            int diaNascimento = sc.nextInt();
            System.out.println();

            System.out.printf("A data do seu nascimento então é %d/%d/%d", diaNascimento, mesNascimento, anoNascimento);
            System.out.println();

            System.out.println(vc.verificador());
        }
        else{
            System.out.println("Você não pode votar!");
        }

        sc.close();
    }
}

