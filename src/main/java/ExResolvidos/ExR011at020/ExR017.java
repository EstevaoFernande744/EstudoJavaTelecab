package ExResolvidos.ExR011at020;

import java.util.Scanner;

public class ExR017 {

    public static void main(String[] args) {
        System.out.println("Digite duas coordenadas diferentes de 0:");

        Scanner sc = new Scanner (System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();

    while (x != 0 && y != 0){
        if (x > 0 && y > 0) {
            System.out.println("Primeiro!");
        }
        else if(x < 0 && y > 0){
            System.out.println("Segundo!");
        }
        else if(x < 0 && y < 0){
            System.out.println("Terceiro!");
        }
        else{
            System.out.println("Quarto!");
        }

        x = sc.nextInt();
        y = sc.nextInt();
    }

        sc.close();
    }
}
