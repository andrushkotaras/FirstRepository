import java.util.Arrays;
public class Teacher {

    // Поля класу
    private String name;
    private String surName;
    private int age;
    private  Student student;
    private Student [] students;


    // Конструктор класу
    public Teacher(String name, String surName, int age, Student student) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.student = student;
    }
    public Teacher(String name, String surName, int age, Student student, Student[] students) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.student = student;
        this.students = students;
    }

    // Методи класу
    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getSurName(){
        return surName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setStudent(Student  student) {
        this.student = student;
    }
    public Student getStudent(){
        return student;
    }
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", student=" + student +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
