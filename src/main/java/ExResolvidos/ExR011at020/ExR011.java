package ExResolvidos.ExR011at020;

import java.util.Scanner;

public class ExR011 {

    public static void main(String[] args) {

        System.out.println("Digite os valores de inicio e fim do periodo de gameplay:");

        Scanner sc = new Scanner(System.in);

        int horarioInicial = sc.nextInt();
        int horarioFinal = sc.nextInt();
        int tempoDeJogo;

        if (horarioFinal > horarioInicial){
            tempoDeJogo = horarioFinal - horarioInicial;
        }
        else {
            tempoDeJogo = 24 - horarioInicial + horarioFinal;
        }

        System.out.printf("O jogo durou %d hora(s)!", tempoDeJogo);

        sc.close();
    }
}
