package Synchronized;

public class A implements Runnable {
    private int counter=0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (this){
            setCounter(getCounter()+1);
        }
    }
}
