import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        System.out.println("Informe um numero");
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int parcial = 11;
        int resultado = 111;
        System.out.println("A sequência numérica é: " + (n + "," + (n * parcial) + "," + (n * resultado)));
        System.out.println("A soma destes números é: " + (n + (n * parcial) + (n * resultado)));
        leitor.close();

    }
}
