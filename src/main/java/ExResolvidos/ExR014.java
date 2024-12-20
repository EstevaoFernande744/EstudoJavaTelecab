package ExResolvidos;

import java.util.Scanner;

public class ExR014  {

    public static void main(String[] args) {

        System.out.println("Digite os valor de x e y respectivamente:");

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x == 0.0 && y == 0.0){
            System.out.println("Origem!");
        }
        else if(x == 0.0){
            System.out.println("Eixo y");
        }
        else if(y == 0.0){
            System.out.println("Eixo x");
        }
        else if(x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if(x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if(x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
