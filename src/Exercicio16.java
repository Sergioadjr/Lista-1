public class Exercicio16 {
    public static void main(String[] args) {
        int contador =0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println("Estes números são impares: " +i);
                contador++;
                System.out.println("A quantidade de números impares são:" + contador );
            }

        }
    }
}