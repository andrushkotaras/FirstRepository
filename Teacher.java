public class Teacher {

    // Поля класу
    private String name;
    private String surName;
    private int age;
    private  Student[][] Student;
    private  Student[] students = Student[10];

    // Конструктор класу

    public Teacher(String name){
        this.name = name;
    }
    public Teacher(String name, String surName, int age, Student i){
        this.name = name;
        this.surName = surName;
    }
    public Teacher(String name, String surName, int age,int Student[]) {
        this.name = name;
        this.surName = surName;
        this.age = age;
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


    public void setStudent(Student[][] Student) {
        this.Student = Student;
    }

    public Student[] getStudents() {
        return students;
    }

}
