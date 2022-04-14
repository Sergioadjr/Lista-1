public class Exercicio13 {
    public static void main(String[] args) {
    
        int contador = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if(i != j && i != k && k != j){
                    System.out.println("" + i + j + k);
                    contador += 1;
                    }
                }
            }
        }
        System.out.println("O numero total de numero de tres digitos é : " + contador);
    }
}