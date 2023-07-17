public class Main {
        public static void main(String[] args) {
                // При створенні обєкту від більш абстрактного класу (Human)
                Human driver = new Driver();
                // Мені пропонує такий варіант викликання методу:
                ((Driver) driver).theWholeTrip();

                Pilot pilot = new Pilot();
                pilot.theWholeFlight();

        }
}

