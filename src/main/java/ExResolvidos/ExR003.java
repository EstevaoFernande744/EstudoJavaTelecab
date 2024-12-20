package ExResolvidos;

public class ExR003 {

    public static void main(String[] args) {

        double raio1 = 2.00;
        double pi = Math.PI;
        double raio2 = 100.64;
        double raio3 = 150.00;
        double area1;
        double area2;
        double area3;

        area1 = pi * Math.pow(raio1, 2);
        area2 = pi * Math.pow(raio2, 2);
        area3 = pi * Math.pow(raio3, 2);


        System.out.printf("A area do circulo de raio %.2f é %.2f\n", raio1, area1);
        System.out.printf("A area do circulo de raio %.2f é %.2f\n", raio2, area2);
        System.out.printf("A area do circulo de raio %.2f é %.2f\n", raio3, area3);

    }

}
