import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
      public static void main(String[] args) {

          Student oleh = new Student("Oleh", "Gents",17);


          Student student = new Student("Taras", "Andrushko", 27);

          Student student1 = new Student("Taras", "Andrushko", 27);

          Student[] students = new Student[] {
                  student, student1
          };

          Teacher teacher = new Teacher("Serhii", "Zhuravlov", 27, student, students);

          System.out.println(teacher);

      }
}

















        /*
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

         */