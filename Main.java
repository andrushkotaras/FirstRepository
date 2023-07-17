public class Main {
        public static void main(String[] args) {
                Human pilot = new Pilot();
                ((Pilot) pilot).theWholeFlight();
                Human driver = new Driver();
                ((Driver) driver).theWholeTrip();
        }
}

