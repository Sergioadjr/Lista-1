public class Exercicio25 {
    public static void main(String[] args) {
        long tempoInicial = System.nanoTime();
        System.out.println("tempo inicial = " + tempoInicial);
        funcao((int) 0.000000001);

        long tempoFinal = System.nanoTime();
        System.out.println("tempo final = " + tempoFinal);
        System.out.println("Tempo total de execução: " + (tempoFinal - tempoInicial));
    }

    private static void funcao(int contador) {
        for (int i = 0; i < contador; i++) {
            System.out.println(i + ",");
        }
    }
}

