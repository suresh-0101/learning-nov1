package threads.synchronization.adderSubtractorSynchronized;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Subtractor implements Runnable{
    private Count count;
    private Lock lock;

    public void run(){

        for (int index = 1; index <=100;index++){
           synchronized (count) {
               int value = count.getValue();
               value -= index;
               count.setValue(value);
           }
        }

        System.out.println("subtractor value :"+count.getValue()+" by "+Thread.currentThread().getName());

    }

}
