public class Exercicio18 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Este número " + i + " é divisível por 3!");
            } else {
                System.out.println("Este número " + i + " NÃO é divisível por 3!");
            }
            if (i % 5 == 0) {
                System.out.println("Este número " + i + " é divisível por 5! ");
            } else {
                System.out.println("Este número " + i + " NÃO é divisível por 5! ");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Este número " + i + " é divisível por 3 e 5 ao mesmo tempo");
            }
        }
    }
}
