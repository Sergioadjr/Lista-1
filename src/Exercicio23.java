import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe 3 valores");
        int x = leitor.nextInt();
        int y = leitor.nextInt();
        int z = leitor.nextInt();
        if (((x >= 20 && x < y-z || x < z-y) || y >= 20 && y < x-z || y < z-x ) || z >= 20 && z < x-y || z <y-x) {
            System.out.println("True");        
        } else {
            System.out.println("False");
        }
        leitor.close();
    }
}
