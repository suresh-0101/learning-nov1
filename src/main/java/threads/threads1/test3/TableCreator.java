package threads.threads1.test3;

public class TableCreator implements Runnable{

    public int val;

    TableCreator(int val){
        this.val = val;
    }

    @Override
    public void run() {
        for (int i = 1; i<=val;i++){
            System.out.println(val+" times "+i+" "+(val*i));
        }
    }
}
