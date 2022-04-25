public class Exercicio28 {
    public static void main(String[] args) {
        long auxiliar = 0;
        long numero1 = 0;
        long numero2 = 1;

        System.out.println(auxiliar);
        for (int i = 0; i < 100; i++) {
            numero1 = numero2 + auxiliar;
            numero2 = auxiliar;
            auxiliar = numero1;
            System.out.println(auxiliar + " ");

        }
    }
}