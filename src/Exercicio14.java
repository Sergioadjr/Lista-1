import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe sua senha");
        String senha = leitor.nextLine();
        System.out.println("A senha informada é: " + senha);
        leitor.close();
    }
}
