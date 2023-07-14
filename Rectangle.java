public class Rectangle implements GeometricShape{

    int dovzyna;
    int vysota;

    Rectangle (int dovzyna, int vysota){
        this.dovzyna = dovzyna;
        this.vysota = vysota;
    }

    public void calculateArea(){
        System.out.println(dovzyna * vysota);
    }
    public void calculatePerimetr(){
        System.out.println(2 * (dovzyna + vysota));
    }
}
