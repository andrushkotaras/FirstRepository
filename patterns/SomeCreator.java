package patterns;

public class SomeCreator extends Creator{
    @Override
    public Product factoryMethod() {
        return new SomeProduct();
    }
}
