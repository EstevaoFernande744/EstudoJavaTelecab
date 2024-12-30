package ExResolvidos.NewProduct;

import java.util.Scanner;

public class ExR033 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        newProduct np = new newProduct();

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto em estoque: ");
        np.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + np);
        System.out.println();

        System.out.println("Digite quantos produtos foram adicionados: ");
        int quantidade = sc.nextInt();
        np.aumento(quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + np);
        System.out.println();

        System.out.println("Digite quantos produtos foram retirados: ");
        quantidade = sc.nextInt();
        np.retirado(quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + np);

        sc.close();
    }
}