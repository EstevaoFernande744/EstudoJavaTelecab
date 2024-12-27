package ExResolvidos.Funcionario;

public class Funcionario {

    public String nome;
    public double salarioS;
    public double taxa;

    public double salarioL() {
        return salarioS - taxa;
    }
    public void aumentoSalario(double porcentagem) {
        salarioS += salarioS * porcentagem / 100.0;
    }
    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioL());
    }

}
