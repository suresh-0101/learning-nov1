package threads.deadlocks.problem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransferTask implements Runnable{

    public BankAccount from;
    public BankAccount to;
    public int amount;

    @Override
    public void run() {

        synchronized (from){
            System.out.println(Thread.currentThread().getName()+" locked "+ from.getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            //since the second account also blocked by t2, we can't access the below function
            synchronized(to) {
                System.out.println(Thread.currentThread().getName() + " locked " + to.getName());
            }
            from.withdraw(amount);
            to.deposit(amount);
        }

    }
}
