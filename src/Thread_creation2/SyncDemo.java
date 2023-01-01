package Thread_creation2;

class Counter
{
    int c;
    //we want one thread to work with this : Sémaphore
    //we add synchronized keywords
    //daba ratl9a result 2001
    public synchronized void increment()
    {
        c++;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter co=new Counter();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    co.increment();
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    co.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        co.increment();
        System.out.println("Count = "+co.c);
    }
}
