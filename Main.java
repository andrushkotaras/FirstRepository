import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                // Завдання 1
                LinkedList<Integer> linkedList = new LinkedList<>();
                for (int i = 1; i <= 10; i++) {
                        linkedList.add(i);
                }
                for (int i = 0; i < linkedList.size(); i++) {
                        linkedList.get(i);
                }
                for (int i = 0; i < linkedList.size(); i++) {
                        linkedList.remove(i);
                }

                // Завдання 2
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = 0; i <= 2000000; i++) {
                        arrayList.add(i);
                }
                for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i);
                }



                // Завдання 3
                Student oleh = new Student("Oleh");
                Student serhii = new Student("Serhii");
                Student taras = new Student("Taras");

                List<Student> studentList = new ArrayList<>();
                studentList.add(oleh);
                studentList.add(serhii);
                studentList.add(taras);

                for (int i = 0; i < studentList.size(); i++){
                        System.out.println(studentList.get(i));
                }
        }
}






