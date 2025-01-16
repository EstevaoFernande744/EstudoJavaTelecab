import java.util.Scanner;
public class detectorDeCorno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de uma pessoa e saiba se ela é corna ou não: ");
        String nome = sc.nextLine();
        if (nome.equals("Patrick") || nome.equals("Kalil") || nome.equals("Rihan")){
            System.out.println("Corno detectado!");
        }
        else{
            System.out.println("Nenhum corno detectado!");
        }

        sc.close();
    }
}
