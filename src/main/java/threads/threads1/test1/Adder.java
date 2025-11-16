package threads.threads1.test1;

public class Adder implements Runnable{

    public int number1;
    public int number2;

    public Adder(int n1, int n2){
        this.number1 = n1;
        this.number2 = n2;
    }

    @Override
    public void run() {
        System.out.println(this.number1 + this.number2);
    }
}
