package patterns;

public class Main {
    public static void main(String[] args){

        Singleton singleton = Singleton.getInstance();


        Creator creator = new SomeCreator();
        Product product = creator.factoryMethod();

    }
}
