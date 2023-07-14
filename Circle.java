public class Circle implements GeometricShape{

    int radius;
    double Pi = 3.14;

    Circle (int radius){
        this.radius = radius;
    }
    public void calculateArea(){

        System.out.println(Pi * radius * radius);
    }
    public void calculatePerimetr(){

        System.out.println(2 * Pi * radius);
    }
}
