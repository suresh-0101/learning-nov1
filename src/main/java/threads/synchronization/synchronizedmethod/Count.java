package threads.synchronization.synchronizedmethod;

public class Count {
    int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void increement(int value){
        this.value += value;
    }
    public synchronized void decreement(int value){
        this.value -= value;
    }
}
