public class Exercicio22 {
    public static void main(String[] args) {
        int segundos = 86399;
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}