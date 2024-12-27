package Raio;

public class CalcRaio2 {

    public static final double PI = 3.14159;

    public static double raio;

    public static double Circunferencia(double raio){
        return 2.0 * PI * raio;
    }
    public static double Volume(double raio){
        return 4.0 * PI * Math.pow(raio, 3) / 3.0;
    }
}
