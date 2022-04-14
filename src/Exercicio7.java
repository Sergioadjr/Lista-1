public class Exercicio7 {
   public static void main(String[] args) {
      int x = 100;
      int y = 200;
      System.out.println("Antes da troca");
      System.out.println("x = " + x);
      System.out.println("y = " + y);

      int i = x;
      x = y;
      y = i;
      System.out.println("Após a troca");
      System.out.println("x = " + x);
      System.out.println("y = " + y);
   }
}