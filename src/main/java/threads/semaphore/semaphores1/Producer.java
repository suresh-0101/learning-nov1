package threads.semaphore.semaphores1;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class Producer implements Runnable{

    private Queue<UnitOfWork> buffer;
    private int maxSize;
    private String name;

    @Override
    public void run() {
        while (true) {
           if(buffer.size()<maxSize){
               buffer.add(new UnitOfWork());
               System.out.println( name + " Produced Food. Current size :" + buffer.size());
           }
        }

    }
}
