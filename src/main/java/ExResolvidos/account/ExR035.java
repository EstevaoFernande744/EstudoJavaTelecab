package ExResolvidos.account;

import java.util.Scanner;

public class ExR035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc; // declarando fora do if para poder usar no programa inteiro sem se preocupar

        System.out.println("Digite com o número da conta: ");
        int number = sc.nextInt();
        System.out.println("Digite com o nome da conta: ");
        sc.nextLine(); // para comer a linha deixada pelo nextInt
        String nome = sc.nextLine();

        System.out.println("Tem deposito inicial (y/n)? ");
        char yesorno = sc.next().charAt(0); // ler o primeiro caracter
        if (yesorno == 'y'){
            System.out.println("Digite o valor de deposito: ");
            double initialDeposite = sc.nextDouble();
            acc = new Account(number, nome, initialDeposite);
        }
        else {
            acc = new Account(number, nome);
        }

        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println(acc);

        System.out.println();
        System.out.print("Digite um valor de deposito: ");
        double valorDeposito = sc.nextDouble();
        acc.deposit(valorDeposito);
        System.out.println("Saldo da conta: ");
        System.out.println(acc);

        System.out.println();
        System.out.print("Digite um valor de saque: ");
        double valorSaque = sc.nextDouble();
        acc.saque(valorSaque);
        System.out.println("Saldo da conta: ");
        System.out.println(acc);

        sc.close();
    }
}
