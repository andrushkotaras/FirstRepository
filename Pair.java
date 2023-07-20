public class Pair <T extends Number, M extends String> {
    private T item;
    private M item2;


    public T getFirst(){
        return item;
    }
    public void setFirst(T item){
        this.item = item;
    }

    public M getSecond(){
        return item2;
    }
    public void setSecond(M item2){
        this.item2 = item2;
    }
}
