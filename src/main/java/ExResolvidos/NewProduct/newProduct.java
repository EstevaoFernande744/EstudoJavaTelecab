package ExResolvidos.NewProduct;

public class newProduct {

    private String nome;
    private double preco;
    public int quantidade;

    // ------------------ testando sobrecarga

    public newProduct(){

    }

    public newProduct(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public newProduct(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // ------------------ testando sobrecarga

    // -------------------- usando metodo get e set

    public String getNome(){
        return nome;
    }
    public void setName(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){ // mudando a variavel preço com set
        this.preco = preco;
    }

    public int getQuantidade (){ // pegando a variavel quantidade com get
        return quantidade;
    }

    // -------------------- usando metodo get e set


    public double valorPEmEstoque (){
        return preco * quantidade;
    }

    public void aumento (int quantidade){
        this.quantidade += quantidade;
    }
    public void retirado (int quantidade){
        this.quantidade -= quantidade;
    }
    public double valorDoEstoque(){
        return quantidade * preco;
    }

    public String toString(){
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + " , "
                + quantidade
                + " unidades, total: $ "
                + String.format("%.2f", valorDoEstoque());
        }
}
