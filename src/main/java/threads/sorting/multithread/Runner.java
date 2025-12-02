package threads.sorting.multithread;

import java.util.List;
import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> values = List.of(99,101,2,9,222,55,23,0,-7);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(values,executorService);

        Future<List<Integer>> listFuture = executorService.submit(sorter);

        System.out.println(listFuture.get());

    }
}
