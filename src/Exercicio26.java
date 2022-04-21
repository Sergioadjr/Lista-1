public class Exercicio26 {    
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) 
            System.out.println("Fatorial de " + i + "=" + fatorial( i ));

        } public static double fatorial(int n) {
            return n == 0 ? 1 : n * fatorial(n - 1);
        }
    }