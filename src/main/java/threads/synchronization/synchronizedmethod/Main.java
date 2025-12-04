package threads.synchronization.synchronizedmethod;

import threads.synchronization.adderSubtractorSynchronized.Adder;
import threads.synchronization.adderSubtractorSynchronized.Count;
import threads.synchronization.adderSubtractorSynchronized.Subtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count,lock);
        Subtractor subtractor = new Subtractor(count,lock);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(adder);
        executorService.submit(subtractor);
        //since main thread didn't wait for the adder and subtractor computation, we always get 0 as output.
        // stop the executorService for few seconds, so adder and subtractor get computed in the different threads
        executorService.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println("final value :"+count.getValue()+" by "+Thread.currentThread().getName());

    }
}
