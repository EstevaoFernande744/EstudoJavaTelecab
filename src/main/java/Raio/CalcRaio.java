package Raio;

public class CalcRaio {

    public final double PI = 3.14159;

    public double raio;

    public double Circunferencia(double raio){
        return 2.0 * PI * raio;
    }
    public double Volume(double raio){
        return 4.0 * PI * Math.pow(raio, 3) / 3.0;
    }
}
