package threads.semaphore.semaphores1;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class Consumer implements  Runnable{

    Queue<UnitOfWork> buffer;
    String name;

    @Override
    public void run() {
        while (true){

            if(buffer.size()>0){

                buffer.remove();
                System.out.println(name +" consumed food. Current size :"+buffer.size());

            }

        }

    }
}
