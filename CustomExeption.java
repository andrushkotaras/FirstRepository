public class CustomExeption extends Exception {

    private String message;

    public CustomExeption(String message) {
        super(message);
        this.message = message;
    }
}
