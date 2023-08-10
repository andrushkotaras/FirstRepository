import java.util.*;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;
import java.lang.Comparable;
public class Main {
        public static void main(String[] args) {
              List<Student> students = new ArrayList<>();

              students.add(new Student("Andrushko", 3.4));

              Student pavlenko = new Student("Pavlenko", 3.5);
              students.add(pavlenko);
              Student bilous = new Student("Bilous", 3.6);
              students.add(bilous);
              Student sahanda = new Student("Sahanda", 3.7);
              students.add(sahanda);

              Collections.sort(students);

              for (Student student: students) {
                  System.out.println(student.getSurName() + " " + student.getMark());
              }






        }
}

















      /*  static List<String> words = new ArrayList<>();
        private static void addWordToArrayList(){
                System.out.println("Додайте слово до ArrayList: ");
                Scanner scanner = new Scanner(System.in);
                String wordToArray = scanner.next();
                if (words.contains(wordToArray)){
                        System.out.println("Це слово вже є в ArrayList." +
                                " Придумайте інше слово: ");
                        addWordToArrayList();
                }
                else
                        words.add(wordToArray);
                System.out.println(words.lastIndexOf(wordToArray));

       */

      /*  int i = 1;
                while (i <= 10){
                        System.out.println("Вводьте слово: ");

                        Scanner scan = new Scanner(System.in);
                        String word = scan.next();
                        String noToHash = "No";
                        String yesToHash = "Yes";

                        if (word.hashCode() == noToHash.hashCode()){
                        System.out.println(words.toString() + " Is end of program.");
                        i = 15;
                        }
                        if (word.hashCode() == yesToHash.hashCode()){
                        addWordToArrayList();
                        }

                        }

       */