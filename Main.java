import java.util.Scanner;
  public class Main {
      public static void main(String[] args) {
          bilshe(3, 4);
          menshe(6,7);
          int p1;
          System.out.println("Введіть число");
          Scanner input = new Scanner(System.in);
          p1 = input.nextInt();

      }

      private static void bilshe(int b1, int b2) {
          if (b1 > b2) {
              System.out.println("b1 > b2");
          }
          if (b1 < b2) {
              System.out.println("b1 < b2");
          } else {
              System.out.println("b1 = b2");
          }

      }

      private static void menshe (int m1, int m2 ){
          if (m1 < m2) {
              System.out.println("m1 < m2");
          }
          if (m1 > m2) {
              System.out.println("m1 > m2");
          } else {
              System.out.println("m1 = m2");
          }
      }

      private static void parnist(int p1) {
          if (p1 % 2 == 0) {
              System.out.println("Число парне");
          } else {
              System.out.println("Число не парне");
          }

      }
  }