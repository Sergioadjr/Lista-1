import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        int numero1;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número ");
        numero1 = leitor.nextInt();

        while (numero1 != 1) {
            if (numero1 % 2 == 0) {
                numero1 = numero1 / 2;
            } else {
                numero1 = 3 * numero1 + 1;
            }
            System.out.print(numero1 + " ->");
        }
        System.out.println("fim.");

        leitor.close();
    }
}