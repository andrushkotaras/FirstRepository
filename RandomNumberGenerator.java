import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return (int) (Math.random() * 50) + 1;
    }
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int numberOfThreads = 10; // Кількість потоків у пулі
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);


        Future<Integer>[] futures = new Future[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            Callable<Integer> task = new RandomNumberGenerator();
            futures[i] = executorService.submit(task);
        }

        for (int i = 0; i < numberOfThreads; i++) {
            Integer result = futures[i].get();
            System.out.println("Потік " + (i + 1) + " згенерував число: " + result);
        }

        executorService.shutdown();
    }
}
