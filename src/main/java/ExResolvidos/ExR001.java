package ExResolvidos;

public class ExR001 {

    public static void main(String[] args) {

        double h = 10.0;
        double w = 30.0;
        double valorPorMetro = 200.00;
        double area;
        double preco;

        area = h * w;
        preco = area * valorPorMetro;

        System.out.printf("A area do terreno é equivalente a: %.1f\n O preço do terreno é %.2f\n", area, preco);

    }

}
