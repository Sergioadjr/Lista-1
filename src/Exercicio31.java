import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o dia do seu nascimento");
        int x = leitor.nextInt();
        System.out.println("informe o mês do seu nascimento");
        int y = leitor.nextInt();
        System.out.println("informe o ano do seu nascimento");
        int z = leitor.nextInt();
        int dia = 26;
        int mes = 4;
        int ano = 2022;
        
        if (x > 30 || y > 12 || z > 2022) {
            System.out.println("Informe uma data válida");
        } else {

            int resultadoDia = dia - x;
            
            int resultadoMes = mes - y;
            
            int resultadoAno = ano - z;
            
            int totalDias;
            
            totalDias = (resultadoAno * 365) + (resultadoMes * 30) + (resultadoDia);
            
            System.out.println(resultadoAno + " anos" + resultadoMes + " meses e " + resultadoDia + " dias"
                    + " - total de dias: " + totalDias);
        }
        leitor.close();
    }
}