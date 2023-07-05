public class SmallCars extends Cars {
    // Конструктор класу
    public SmallCars(boolean isCarSmall) {
        super(isCarSmall);
    }

    @Override
    public void typeOfCars() {
        super.typeOfCars();
        if(isCarSmall){
            System.out.println("VW is small car");
        }
        else {
            System.out.println("VW is not small car");
        }

    }
}