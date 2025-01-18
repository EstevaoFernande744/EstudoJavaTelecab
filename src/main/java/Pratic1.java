import java.util.Scanner;


public class Pratic1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pratic2 prt = new Pratic2();

        System.out.println("Entre com os dados do produto:");
        System.out.print("Nome do produto: ");
        prt.produto = sc.nextLine();
        System.out.print("preço do produto: ");
        prt.preco = sc.nextDouble();
        System.out.print("quantidade no stock do produto: ");
        prt.stock = sc.nextInt();

        System.out.printf(toString());
        System.out.println();

        System.out.println("Itens adicionados no stock: ");
        int stock = sc.nextInt();
        prt.adicionarP(stock);
        System.out.println("Dados do produto: %s, R$ %.2f, %d unidades em estoque, Total a pagar R$ %.2f",
                prt.produto, prt.preco, prt.stock, prt.adicionarP());

        System.out.println();
        System.out.println("Itens retirados do stock: ");
        int stock = sc.nextInt();
        prt.removerP(stock);
        System.out.println("Dados do produto: %s, R$ %.2f, %d unidades em estoque, Total a pagar R$ %.2f",
                prt.produto, prt.preco, prt.stock, prt.removerP());



        sc.close();
    }
}
