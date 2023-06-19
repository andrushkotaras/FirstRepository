 public class Main {
      public static void main(String[] args) {

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
      }
  }