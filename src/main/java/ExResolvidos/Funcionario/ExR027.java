package ExResolvidos.Funcionario;

import java.util.Scanner;

public class ExR027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salario Solido: ");
        func.salarioS = sc.nextDouble();
        System.out.print("taxa: ");
        func.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("ExResolvidos.Funcionario: " + func);
        System.out.println();
        System.out.print("Qual porcentagem para aumentar o salário? ");
        double porcentagem = sc.nextDouble();
        func.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + func);

        sc.close();
    }
}
