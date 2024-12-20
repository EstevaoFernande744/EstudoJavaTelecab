package ExResolvidos.ExR001at010;

public class ExR006 {

    public static void main(String[] args) {

        int codigo1 = 12;
        int quantidade1 = 1;
        double valorUnitario1 = 5.30;

        int codigo2 = 16;
        int quantidade2 = 2;
        double valorUnitario2 = 5.10;

        int codigo3 = 13;
        int quantidade3 = 2;
        double valorUnitario3 = 15.30;

        int codigo4 = 161;
        int quantidade4 = 4;
        double valorUnitario4 = 5.20;

        int codigo5 = 1;
        int quantidade5 = 1;
        double valorUnitario5 = 15.10;

        int codigo6 = 2;
        int quantidade6 = 1;
        double valorUnitario6 = 15.10;

        double valor1;
        double valor2;
        double valor3;

        valor1 = quantidade1 * valorUnitario1 + quantidade2 * valorUnitario2;
        valor2 = quantidade3 * valorUnitario3 + quantidade4 * valorUnitario4;
        valor3 = quantidade5 * valorUnitario5 + quantidade6 * valorUnitario6;

        System.out.printf("O orçamento dos produtos do codigo %d e %d é igua %.2f\n\n", codigo1, codigo2, valor1);
        System.out.printf("O orçamento dos produtos do codigo %d e %d é igua %.2f\n\n", codigo3, codigo4, valor2);
        System.out.printf("O orçamento dos produtos do codigo %d e %d é igua %.2f\n\n", codigo5, codigo6, valor3);

    }

}
