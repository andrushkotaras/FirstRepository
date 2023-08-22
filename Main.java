

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        firstTask();

    }
    private static void firstTask (){
        Scanner scanner = null;
        try {
            System.out.println("Введіть число: ");
            scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("Ваше число: " + a + " , програма завершена.");
        } catch (InputMismatchException e) {
            System.out.println("Input problems");
            firstTask();
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }

    private static void secondTask (){
        Scanner scanner = null;
        try {
            System.out.print("Введіть чило більше 0: ");
            scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            System.out.println(b*b);
        } catch (CustomExeption e){

        }

    }
}