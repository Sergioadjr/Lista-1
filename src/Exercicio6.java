import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double altura;
        double largura;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a altura do retângulo ");
        altura = leitor.nextDouble();
        System.out.println("Informe a largura retângulo ");
        largura = leitor.nextDouble();

        if (altura == largura) {
            System.out.println("Informe valores válidos para um retângulo");
        } else {
            System.out.println("O perímetro do retângulo é de: " + ((2 * altura) + 2 * largura));
            System.out.println("A área do retângulo é de: " + altura * largura);
        }
        leitor.close();
    }
}
