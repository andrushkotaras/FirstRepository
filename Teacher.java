public class Teacher {
    private String name;
    private String surName;
    private int age;
    private String Student;

    public Teacher(){
    }
    public Teacher(String name){
        this.name = name;
    }
    public Teacher(String name, String surName){
        this.name = name;
        this.surName = surName;
    }
    public Teacher(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    public void setStudent(String Student){
        this.Student = Student;
    }
    public String getStudent(){
        return Student;
    }


}
