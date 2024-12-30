package Eleicoes2026;

public class Eleicoes {

    private int idade;
    private int anoDasEleicoes = 2026;
    private int mesDasEleicoes = 10;
    private int diaDasEleicoes = 26;
    private int mesNascimento;
    private int anoNascimento;
    private int diaNascimento;

    // sobrecarga

    // construtor padrão
    public Eleicoes(){}

    // construtor com os parâmetros
    public Eleicoes(int idade, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.idade = idade;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
    };

    // sobrecarga

    // metodo set e get
    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}

    public int getMesNascimento(){return mesNascimento;}
    public void setMesNascimento(int mesNascimento){this.mesNascimento = mesNascimento;}

    public int getAnoNascimento(){return anoNascimento;}
    public void setAnoNascimento(int anoNascimento){this.anoNascimento = anoNascimento;}

    public int getDiaNascimento(){return diaNascimento;}
    public void setDiaNascimento(int diaNascimento){this.diaNascimento = diaNascimento;}

    public int getAnoDasEleicoes(){return anoDasEleicoes;}

    public int getMesDasEleicoes(){return mesDasEleicoes;}

    public int getDiaDasEleicoes(){return diaDasEleicoes;}

    // metodo set e get

    public int calcIdade() {
        return anoDasEleicoes - anoNascimento;

    }

    public String verificador(){
        int calculador = calcIdade();

        StringBuilder mensagem = new StringBuilder();
        mensagem.append("No dia das eleições você terá ").append(calculador).append(" anos.\n");

        // Ajusta a idade se a pessoa não completou aniversário antes das eleições
        if (mesNascimento > mesDasEleicoes || (mesNascimento == mesDasEleicoes && diaNascimento > diaDasEleicoes)) {
            calculador--; // Ainda não fez aniversário
        }

        // Determina se a pessoa pode votar
        if (calculador > 16) {
            return "No dia das eleições você terá " + calculador + " anos.\nJá pode escolher fazer o título e votar.";
        } else if (calculador == 16 && (mesNascimento < mesDasEleicoes || (mesNascimento == mesDasEleicoes && diaNascimento <= diaDasEleicoes))) {
            return "No dia das eleições você terá " + calculador + " anos.\nTudo certo, já pode votar.";
        } else {
            return "No dia das eleições você terá " + calculador + " anos.\nInfelizmente você completa idade depois das eleições.";
        }
    }
}
