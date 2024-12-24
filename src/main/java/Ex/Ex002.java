package Ex;

public class Ex002 {

    public static void main(String[] args) {

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B)/ 2.0 * h;

        System.out.printf("Essa é a area do trapezio %.2f\n", area);

        int c, d;
        double resultado;

        c = 5;
        d = 2;

        resultado = (double) c / d;

        System.out.printf("A divisão de %d e %d é %.2f",  c, d, resultado);
    }
}
