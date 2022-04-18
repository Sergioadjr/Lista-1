import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        System.out.println("Informe um numero");
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        if (n%2==0) {
            System.out.println("Este número é par: 1" );
        } else {
            System.out.println("Este número é impar: 0");
        }
        leitor.close();
    }
}
