import java.util.*;

public class Main {
        public static void main(String[] args) {
                Set<Integer> hashSet = new HashSet<>();
                Set<Integer> linkedHashSet = new LinkedHashSet<>();
                TreeSet<Integer> treeSet = new TreeSet<>();

                for (int i = 0; i <= 1000; i++) {
                        int a = (int) (Math.random() * 51);
                        new HashSet<>();
                        hashSet.add(a);
                        System.out.println( a + " HashSet");
                        System.out.println("Hash Code - " + hashSet.hashCode());

                }
                // З лекції: HashSet не "заміняє" старий об'єкт новим.

                for (int i = 0; i <= 1000; i++) {
                        int b = (int) (Math.random() * 51);
                        new LinkedHashSet<>();
                        linkedHashSet.add(b);
                        System.out.println( b + " (LinkedHashSet)");
                        System.out.println("Hash Code - " + linkedHashSet.hashCode());
                }

                for (int i = 0; i <= 1000; i++) {
                        int c = (int) (Math.random() * 51);
                        new TreeSet<>();
                        treeSet.add(c);
                        System.out.println( c + " (TreeSet)");
                     // System.out.println("Hash Code - " + treeSet.hashCode()); // Однаковий хеш код
                }
        }
}
