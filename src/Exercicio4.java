import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Double a;
        Double b;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        a = leitor.nextDouble();
        System.out.println("Informe o segundo número");
        b = leitor.nextDouble();

        System.out.println("A soma dos números é: " + (a + b));
        System.out.println("A subtração do primeiro número com o segundo número é: " + (a - b));
        System.out.println("A multiplicação dos números é: " + (a * b));
        System.out.println("A divisão do primeiro número com o segundo número é: " + (a / b));
        System.out.println("O resto da divisão do primeiro número com o segundo número é de: " + (a % b));

        System.out.println("A soma dos números é: " + (a + b));
        System.out.println("A subtração do segundo número com o primeiro número é: " + (b - a));
        System.out.println("A multiplicação dos números é: " + (a * b));
        System.out.println("A divisão do segundo número com o primeiro número é: " + (b / a));
        System.out.println("O resto da divisão do segundo número com o primeiro número é de: " + (b % a));
        leitor.close();
    }
}
