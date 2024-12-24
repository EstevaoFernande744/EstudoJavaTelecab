package retangulo;

import java.util.Scanner;

public class ExR026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        ret.w = sc.nextDouble();
        ret.h = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", ret.area());
        System.out.printf("PERIMETER = %.2f\n", ret.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", ret.diagonal());

        sc.close();
    }
}
