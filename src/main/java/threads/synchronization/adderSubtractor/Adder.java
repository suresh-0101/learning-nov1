package threads.synchronization.adderSubtractor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Adder implements Runnable{

    public Count count;


    @Override
    public void run() {

        for (int index = 1; index <=100 ; index++) {
            int value = count.getValue();
            value    += index ;
            count.setValue(value);
        }
        System.out.println("Adder value :"+count.getValue());

    }
}
