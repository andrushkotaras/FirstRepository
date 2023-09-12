public class NumberGeneratorThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                int randomNumber = (int) (Math.random() * 10) + 1;
                System.out.println("Згенероване число: " + randomNumber);

                if (randomNumber == 5) {
                    System.out.println("Згенероване число дорівнює 5, потік завершує роботу.");
                    break;
                }

                // Затримка перед генерацією наступного числа
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}






