import java.util.Comparator;

public class SortByMark implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if ( student1.getMark() == student2.getMark()) {
            return 0;
        }
        if ( student1.getMark() < student2.getMark()){
            return  1;
        }
        return -1;
    }
}
