package threads.threads1.test1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        Adder adder = new Adder(number1,number2);
        Thread adderThread = new Thread(adder);
        adderThread.start();

        System.out.println("I'm main thread");

    }
}
