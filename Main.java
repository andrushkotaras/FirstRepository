import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
          //Дз №6
          // Завдання 1
          for (int number = 1; number <= 100; number = number + 1){
              System.out.println(number);
          }

          // Завдання 2
          for (int number2 = 0; number2 <= 100; number2 = number2 + 1){
              if (number2 % 2 == 0) {
                  System.out.println(number2);
              }
          }

          // Завдання 3
          int i = 1;
          int fact = 1;
          do {
              fact = fact * i;
              System.out.println(fact);
              i++;
          } while (i <= 7);

          //Завдання 4
          int f2 = 0;
          for (int f = 1; f2 < 100; f = f + f2){
              System.out.println(f);
              f2 = f + f2;
              if (f2 > 100)
                  break;
              System.out.println(f2); }

          //Дз №7
          // Завдання 1
          System.out.print("Введіть число: ");
          Scanner sc = new Scanner(System.in);
          int scanNumber = sc.nextInt();
          System.out.println(cub(scanNumber));

          // Завдання 2
          System.out.print("Кількість зірочок: ");
          Scanner st = new Scanner(System.in);
          int stars = st.nextInt();
          starsMethod(stars);

          // Завдання 3
          System.out.println("Введіть  число повторювань символу: ");
          Scanner tim = new Scanner(System.in);
          int times = tim.nextInt();

          symbols(times);
      }


      public static int cub (int scanNumber){
          return scanNumber * scanNumber * scanNumber;
      }
      public static void starsMethod (int stars){
          String star = "*";
          if (stars > 0) {
              System.out.println(star);
              stars--;
              starsMethod(stars);
          }
      }
      public static void symbols (int times){
          System.out.print("Введіть символ: ");
          Scanner symb = new Scanner(System.in);
          String symbol = symb.next();

          while (times > 0){
              System.out.println(symbol);
              times--;
          }
      }
  }