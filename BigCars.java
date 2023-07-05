public class BigCars extends Cars {

    public BigCars(boolean isCarSmall) {
        super(isCarSmall);
    }

    @Override
    public void typeOfCars() {
        super.typeOfCars();
        if(isCarSmall){
            System.out.println("Man is not big car");
        }
        else {
            System.out.println("Man is big car");
        }
    }
}