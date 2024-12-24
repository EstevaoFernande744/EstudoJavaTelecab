package Ex.AreaTriangulo;

import java.util.Scanner;
import java.util.Locale;

public class Ex010x0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter with the measures of triangle x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter with the measures of triangle x: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p1 = (xA + xB + xC)/2;
        double areaX = Math.sqrt(p1 * (p1 - xA)*(p1 - xB)*(p1 - xC));
        double p2 = (yA + yB + yC)/2;
        double areaY = Math.sqrt(p2 * (p2 - yA)*(p2 - yB)*(p2 - yC));

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
