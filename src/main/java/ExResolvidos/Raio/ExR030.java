package ExResolvidos.Raio;

import java.util.Scanner;

public class ExR030 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcRaio1 cr = new CalcRaio1();

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double circun = cr.Circunferencia(raio);
        double vol = cr.Volume(raio);

        System.out.printf("Circunferencia: %.2f\n", circun);
        System.out.printf("Volume: %.2f\n", vol);
        System.out.printf("Pi value: %.2f\n", cr.PI);

        sc.close();
    }
}
