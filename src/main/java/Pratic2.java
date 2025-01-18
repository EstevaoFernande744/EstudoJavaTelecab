public class Pratic2 {

    public String produto;
    public double preco;
    public int stock;

    public double quantidadeStock(){
        return preco * stock;
    }

    public void adicionarP(int stock){
        this.stock += stock;
    }

    public void removerP(int stock){
        this.stock -= stock;
    }

    public String toString(){
        System.out.println("Dados do produto: %s, R$ %.2f, %d unidades em estoque, Total a pagar R$ %.2f",
                prt.produto, prt.preco, prt.stock, prt.quantidadeStock());
    }
}
