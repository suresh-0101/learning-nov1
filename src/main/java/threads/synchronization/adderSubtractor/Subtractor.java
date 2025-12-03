package threads.synchronization.adderSubtractor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Subtractor implements Runnable{
    private Count count;

    public void run(){

        for (int index = 1; index <=100;index++){
            int value = count.getValue();
            value     -= index;
            count.setValue(value);
        }

        System.out.println("Subtractor value :"+count.getValue()+" by "+Thread.currentThread().getName());
    }

}
