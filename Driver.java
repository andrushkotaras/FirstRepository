public class Driver extends Human implements ToDrive{
    @Override
    public void startTheEngine() {
        System.out.println("Start the engine");
    }

    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void theWholeTrip() {
        startTheEngine();
        go();
        stop();
    }
}
