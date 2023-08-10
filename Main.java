import java.util.*;
import java.util.ArrayList;
import java.util.List;

// https://github.com/andrushkotaras/FirstRepository/blob/main/SortByMark.java
// https://github.com/andrushkotaras/FirstRepository/blob/main/SortBySurname.java
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Andrushko", 3.4)); //!!!

        Student pavlenko = new Student("Pavlenko", 3.5);
        students.add(pavlenko);
        Student bilous = new Student("Bilous", 3.6);
        students.add(bilous);
        Student sahanda = new Student("Sahanda", 3.7);
        students.add(sahanda);

        System.out.println("Оригінальний лист: " + students.toString());

        System.out.println("Лист відсортований по середньому балу (від більшого до меншого):");
        Collections.sort(students, new SortByMark());
        for (Student student : students) {
            System.out.println(student.getSurName() + " " + student.getMark());
        }

        System.out.println("Лист відсортований в алфавітному порядку:");
        Collections.sort(students, new SortBySurname());
        for (Student student : students) {
            System.out.println(student.getSurName() + " " + student.getMark());
        }

    }
}