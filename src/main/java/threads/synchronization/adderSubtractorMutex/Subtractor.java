package threads.synchronization.adderSubtractorMutex;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Subtractor implements Runnable{
    private Count count;
    private Lock lock;

    public void run(){

        for (int index = 1; index <=100;index++){

            lock.lock();
            //below execution is the critical section
            int value = count.getValue();
            value     -= index;
            count.setValue(value);
            //critical section ends
            lock.unlock();
        }

        System.out.println("subtractor value :"+count.getValue()+" by "+Thread.currentThread().getName());

    }

}
