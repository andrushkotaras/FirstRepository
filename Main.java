import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
      public static void main(String[] args) {

          Student oleh = new Student("Oleh", "Gents",17);
          Student pavlo = new Student();
          pavlo.setName("Pavlo");
          System.out.println(oleh.getSurname());
          Teacher vchytel = new Teacher("Victor","Halun", 55, oleh);
          System.out.println();




      }
}

















          /*
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



          //Дз №8
          // Завдання 1
          Random random = new Random();
          final int range = 100;
          int [] masyv = new int[10];
          for (int g = 0; g<10; g++){
              masyv [g] = random.nextInt(range);
          }

          // Завдання 2
          System.out.println(Arrays.toString(masyv));

          // Завдання 3
          Arrays.sort(masyv);
          System.out.println(masyv[0]);

          // Завдання 4
          System.out.println(masyv[9]);

          // Завдання 5
          double suma = 0;
          for (int m = 0; m<10; m++){
              suma = suma + masyv[m];
          }
          System.out.println("Сума елементів масиву - " + suma);

          // Завдання 6
          System.out.println("Середнє значення елементів масиву - " + suma / masyv.length);

      }

    /*


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

     */
