public class Exercicio3 {
    public static void main(String[] args) {
        int j;
        // (i)/3 = if 0 (true) else (false)//
        for (int i = 1; i <= 100; i++) {
            j = i;
            if (i % 3 == 0) {
                System.out.println("Estes são os numeros divisiveis por 4: " + j);
            }
        }
    }
}