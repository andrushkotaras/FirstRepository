public class Main {
        public static void main(String[] args) {
                // Методи First працюють тільки з числами.
                // Методи Second працюють виключно з рядками.
                Pair object = new Pair();
                object.setFirst(445566);
                object.setSecond("dddd");

                System.out.println( object.getFirst() + " " + object.getSecond());
                Pair object2 = new Pair();
                object2.setFirst(345);
                System.out.println(object2.getFirst());
        }
}

