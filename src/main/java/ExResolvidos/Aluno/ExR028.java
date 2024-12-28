package ExResolvidos.Aluno;

import java.util.Scanner;

public class ExR028 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");

        Aluno alu = new Aluno();

        alu.nome = sc.nextLine();
        System.out.println("Digite suas 3 notas: ");
        alu.nota1 = sc.nextDouble();
        alu.nota2 = sc.nextDouble();
        alu.nota3 = sc.nextDouble();

        if (alu.notaFinal() < 60.0 ){
            System.out.printf("4° prova, com %.2f\n", alu.notaFinal());
            System.out.printf("Precisa de %.2f pontos.\n", alu.pontos());
        }
        else {
            System.out.printf("Aprovado! com %.2f", alu.notaFinal());
        }



        sc.close();
    }
}
