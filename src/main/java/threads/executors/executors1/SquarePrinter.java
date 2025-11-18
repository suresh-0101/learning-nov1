package threads.executors.executors1;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SquarePrinter {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        //At max 5 thread will be created in the thread pool
        Executor executor = Executors.newFixedThreadPool(5);

        for(Integer val : list){
            executor.execute(new SquarePrinterRunner(val));
        }

    }
}

//NOTE :
//Executors.SingleThreadPool() - as the name suggested it will create only one thread.
//The benefits for this to avoid in-consistent results when doing multi tasking.
//Redis(key-value) use this concept to avoid to override the value. (waits for the execution and finally this single thread changes the value).