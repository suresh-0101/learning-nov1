package threads.threads1.test5;

public class Client {
    public static void main(String[] args) {

        System.out.println("I am the main class");

        Adder adder = new Adder();
        Thread adderThread = new Thread(adder);
        adderThread.start();

        Subtractor subtractor = new Subtractor();
        Thread subratractorThread = new Thread(subtractor);
        subratractorThread.start();

    }
}
