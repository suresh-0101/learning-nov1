package threads.synchronization.adderSubtractorMutex;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Adder implements Runnable{

    public Count count;
    public Lock lock;


    @Override
    public void run() {

        for (int index = 1; index <=100 ; index++) {

            lock.lock();
            //below is the critical section
            int value = count.getValue();
            value    += index ;
            count.setValue(value);
            //critical section ends
            lock.unlock();
        }
        System.out.println("Adder value :"+count.getValue()+" by "+Thread.currentThread().getName());
    }
}
