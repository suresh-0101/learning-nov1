package threads.synchronization.synchronizedmethod;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Subtractor implements Runnable{
    private Count count;
    private Lock lock;

    public void run(){

        for (int index = 1; index <=100;index++){
          count.decreement(index);
        }

        System.out.println("subtractor value :"+count.getValue()+" by "+Thread.currentThread().getName());

    }

}
