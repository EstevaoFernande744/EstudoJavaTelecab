package ExResolvidos.ExR001at010;

public class ExR007 {

    public static void main(String[] args) {

        double A = 3.0;
        double B = 4.0;
        double C = 5.2;

        double D = 12.7;
        double E = 10.4;
        double F = 15.2;

        double trianguloR1;
        double circulo1;
        double trapezio1;
        double quadrado1;
        double retangulo1;
        double pi = Math.PI;

        double trianguloR2;
        double circulo2;
        double trapezio2;
        double quadrado2;
        double retangulo2;


        trianguloR1 = A * C/2;
        circulo1 = pi * Math.pow(C, 2);
        trapezio1 = (A + B) * C/2;
        quadrado1 = Math.pow(B, 2);
        retangulo1 = A * B;

        trianguloR2 = D * F/2;
        circulo2 = pi * Math.pow(F, 2);
        trapezio2 = (D + E) * F/2;
        quadrado2 = Math.pow(E, 2);
        retangulo2 = D * E;

        System.out.printf("Areas: \n Triangulo: %.3f\n Circulo: %.3f\n Trapezio: %.3f\n Quadrado: %.3f\n " +
                "ExResolvidos.Raio.Retangulo: %.3f\n\n", trianguloR1, circulo1, trapezio1, quadrado1, retangulo1);
        System.out.printf("Areas: \n Triangulo: %.3f\n Circulo: %.3f\n Trapezio: %.3f\n Quadrado: %.3f\n " +
                "ExResolvidos.Raio.Retangulo: %.3f\n\n", trianguloR2, circulo2, trapezio2, quadrado2, retangulo2);

    }

}
