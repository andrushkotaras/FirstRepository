public class Pilot extends Human implements ToFly{
    @Override
    public void takeOff() {
        System.out.println("Take off");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void landing() {
        System.out.println("Landing");
    }

    @Override
    public void theWholeFlight() {
        takeOff();
        fly();
        landing();
    }

}
