package threads.synchronization.synchronizedmethod;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Adder implements Runnable{

    public Count count;
    public Lock lock;


    @Override
    public void run() {

        for (int index = 1; index <=100 ; index++) {
          count.increement(index);
        }
        System.out.println("Adder value :"+count.getValue()+" by "+Thread.currentThread().getName());
    }
}
