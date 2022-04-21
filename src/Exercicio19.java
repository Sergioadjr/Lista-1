import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        System.out.println("Informe um numero");
        Scanner leitor = new Scanner(System.in);
        String n = leitor.next();
        Integer numeroInt = Integer.valueOf(n);
        System.out.println("O número é: " + numeroInt );
        leitor.close();
    }
}