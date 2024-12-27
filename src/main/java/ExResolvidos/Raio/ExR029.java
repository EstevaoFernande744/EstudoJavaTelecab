package ExResolvidos.Raio;

import java.util.Scanner;

public class ExR029 {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);

        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("Pi value: %.2f\n", PI);

        sc.close();
    }

    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }
    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }

}
