package threads.threads1.test5;

//**Raw Problem**
//Write code to achieve the following
//A class Client with main method that prints: I am the main class
//Client class should create a new thread and invoke code in a class called Adder.
//The Adder class should print: I am the Adder class
//Client class should create a new thread and invoke code in a class called Subtractor.
//The Subtractor class should print: I am the Subtractor class

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
