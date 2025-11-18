package threads.executors.executors1;

public class SquarePrinterRunner implements Runnable{

    Integer number = null;

    public SquarePrinterRunner(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number*number +" "+Thread.currentThread().getName());
    }
}
