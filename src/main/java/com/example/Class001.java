package com.example;
import java.util.Locale;

public class Class001 {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;

        System.out.print("Hello, World!");
        System.out.println("Bom dia!");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f\n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x); // sempre com f para formatação
        // .2f 2 casas decimais, %n ou \n quebra linha
        System.out.println("RESULTADO = " + y + " METROS.");
        System.out.printf("RESULTADO = %.2f Metros\n", x);

        // %f = flout,  %d = decimal
    }
}