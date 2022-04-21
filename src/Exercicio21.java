import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número");
        int x = leitor.nextInt();
        System.out.println("Informe outro número");
        int y = leitor.nextInt();
        System.out.println("Informe outro número");
        int z = leitor.nextInt();

        if (y>=x && z >= y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        leitor.close();

    }
}
