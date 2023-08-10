import java.util.Objects;

public class Student {
    private String surName;
    private double mark;

    Student (String surName, double mark){
        this.surName = surName;
        this.mark = mark;
    }

    public Student(String surName) {
        this.surName = surName;
    }

    public String getSurName(){
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.mark, mark) == 0 && Objects.equals(surName, student.surName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(surName, mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "surName='" + surName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
