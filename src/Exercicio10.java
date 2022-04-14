import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Informe um número");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int soma = 0;

        while (numero > 0) {
            soma += (numero % 10);
            numero /= 10;
        }
        System.out.println("O valor de soma é: " + soma);
        leitor.close();
    }
}
