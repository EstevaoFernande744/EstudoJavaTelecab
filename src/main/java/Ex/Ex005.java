package Ex;

import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {

        System.out.println("Digite um valor de 1 a 7:");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch(x){
            case 1:
                dia = "Domingo!";
                break;
            case 2:
                dia = "Segunda-Feira!";
                break;
            case 3:
                dia = "Terça-Feira!";
                break;
            case 4:
                dia = "Quarta-Feira!";
                break;
            case 5:
                dia = "Quinta-Feira!";
                break;
            case 6:
                dia = "Sexta-Feira!";
                break;
            case 7:
                dia = "Sábado!";
                break;
            default:
                dia = "Valor Invalido!";
                break;
        }

        System.out.println("Dia da semana:" + dia);

        sc.close();
    }

}
