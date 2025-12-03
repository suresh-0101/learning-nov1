package threads.synchronization.adderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(adder);
        executorService.submit(subtractor);
        //since main thread didn't wait for the adder and subtractor computation, we always get 0 as output.
        // stop the executorService for few seconds, so adder and subtractor get computed in the different threads
        executorService.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println("final value:"+count.getValue()+" by "+Thread.currentThread().getName());

    }
}
