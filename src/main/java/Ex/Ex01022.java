package Ex;

import java.util.Scanner;
import java.util.Locale;
import entities.    Triangle;

public class Ex0101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter with the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter with the measures of triangle x: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p1 = (x.a + x.b + x.c)/2;
        double areaX = Math.sqrt(p1 * (p1 - x.a)*(p1 - x.b)*(p1 - x.c));
        double p2 = (y.a + y.b + y.c)/2;
        double areaY = Math.sqrt(p2 * (p2 - y.a)*(p2 - y.b)*(p2 - y.c));

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
