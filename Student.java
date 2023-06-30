public class Student {
    // Констуктор класу (Способи прийому інформації про обєкти класу)
    public Student(){
    }
    public Student(String name){
        this.name = name;
    }
    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Поля класу (інформація про обєкти класу)
    private String name;
    private String surname;
    private int age;

    // Методи класу
    public void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }




}