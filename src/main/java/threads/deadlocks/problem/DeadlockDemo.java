package threads.deadlocks.problem;

public class DeadlockDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount accountA = new BankAccount("Suresh", 1000);
        BankAccount accountB = new BankAccount("Ramesh", 1000);

        Thread t1 = new Thread(new TransferTask(accountA, accountB, 100), "T1");
        Thread t2 = new Thread(new TransferTask(accountB, accountA, 200), "T2");

        t1.start();
        t1.join();
        t2.start();
    }
}
