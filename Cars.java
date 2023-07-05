public class Cars {
      public static void main(String[] args) {
        Cars vw = new SmallCars(true);
        vw.typeOfCars();
        Cars man = new BigCars(false);
        man.typeOfCars();
      }
      // Поля класу
      public boolean isCarSmall;

      // Конструктор класу
      public Cars (boolean isCarSmall){
            this.isCarSmall = isCarSmall;
      }
      // Методи класу
      public void typeOfCars(){

      }
}

















        /*
          //Дз №8
          // Завдання 1
          Random random = new Random();
          final int range = 100;
          int [] masyv = new int[10];
          for (int g = 0; g<10; g++){
              masyv [g] = random.nextInt(range);
          }

          // Завдання 2
          System.out.println(Arrays.toString(masyv));

          // Завдання 3
          Arrays.sort(masyv);
          System.out.println(masyv[0]);

          // Завдання 4
          System.out.println(masyv[9]);

          // Завдання 5
          double suma = 0;
          for (int m = 0; m<10; m++){
              suma = suma + masyv[m];
          }
          System.out.println("Сума елементів масиву - " + suma);

          // Завдання 6
          System.out.println("Середнє значення елементів масиву - " + suma / masyv.length);

         */