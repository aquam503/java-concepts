package yield_;

public class A implements Runnable{

    @Override
    public void run() {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        for(int i=0;i<10;i++){
            System.out.println("task "+i+" done by "+t.getName());
            if(i==5){
                t.yield();
            }
        }
    }
    public static void main(String args[]){
        A r=new A();
        Thread t1=new Thread(r,"red1");
        Thread t2=new Thread(r,"redone");
        t1.start();
        t2.start();

    }
}
