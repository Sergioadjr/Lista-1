import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        double area;
        double comprimento;
        double pi = 3.1415;
        //area = (6*s^2)/(4*tan(pi/6))

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o comprimento do hexágono");
        comprimento = leitor.nextDouble();
        area = (6* Math.pow(comprimento, 2))/ (4*Math.tan(pi/6));
        System.out.println("O valor da área do Hexágono é de: " + String.format("%.2f", area));   
        leitor.close();
    }
}
