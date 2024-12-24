package Ex.Product;

import java.util.Scanner;
import java.util.Locale;

public class Ex011x0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + "," + product.price + "," + product.quantity);

        sc.close();
    }
}
