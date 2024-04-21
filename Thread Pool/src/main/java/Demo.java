import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        // in-order to execute 5 threads at a once
        ExecutorService executorService =
                Executors.newFixedThreadPool(5);

        // create 10 threads but 5 are execute once
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new MyRunnable("workerThread-" + i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
        while (executorService.isTerminated()) {}
        System.out.println("Success");
    }
}