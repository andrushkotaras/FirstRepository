import java.util.Objects;
public class Student {
    String name;
    Student (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                '}';
    }
}
