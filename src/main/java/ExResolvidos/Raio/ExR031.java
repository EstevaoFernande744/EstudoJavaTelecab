package ExResolvidos.Raio;

import java.util.Scanner;

public class ExR031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double circun = CalcRaio2.Circunferencia(raio);
        double vol = CalcRaio2.Volume(raio);

        System.out.printf("Circunferencia: %.2f\n", circun);
        System.out.printf("Volume: %.2f\n", vol);
        System.out.printf("Pi value: %.2f\n", CalcRaio2.PI);

        sc.close();
    }
}
