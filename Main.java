import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       firstTask();
       secondTask();

    }
    private static void firstTask (){
        Scanner scanner;
        try {
            System.out.print("Введіть число: ");
            scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("Ваше число: " + a + " , програма завершена.");
        } catch (InputMismatchException e) {
            System.out.println("Значення не коректне");
            firstTask(); // Також можна зробити через While (true)
        }
    }

    private static void secondTask (){
        Scanner scanner = null;
        try {
            System.out.println("Введіть число більше нуля: ");
           scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int squared = calculateSquare(a);
            System.out.println("Квадрат числа: " + squared);
        } catch (CustomExeption e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        } catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }

    public static int calculateSquare(int a) throws CustomExeption {
        if (a <= 0) {
            throw new CustomExeption("Число менше нуля, або нуль");
        }
        return a * a;
    }
}