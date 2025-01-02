package ExResolvidos.account;

public class Account {

    private int number;
    private String nome;
    private double balanco;

    public Account(int number, String nome){
        this.number = number;
        this.nome = nome;
    }
    public Account(int number, String nome, double initialDeposit){
        this.number = number;
        this.nome = nome;
        deposit(initialDeposit); // função deposito
    }

    public int getNumber(){
        return number;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getBalanco(){
        return balanco;
    }

    public void deposit(double valor){
        balanco += valor;
    }
    public void saque(double valor){
        balanco -= valor + 5.0;
    }

    public String toString(){
        return "Conta "
                + number
                + ", nome: "
                + nome
                + ", Balance: $ "
                + String.format("%.2f", balanco);
    }
}
