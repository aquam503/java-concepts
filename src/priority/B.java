package priority;

public class B implements Runnable{
    @Override
    public void run() {
        String s=Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(s+" - Number : "+i);
        }
    }
    public static void main(String[] args){
        Thread t1=new Thread(new B());
        Thread t2=new Thread(new B());
        t1.start();
        t2.start();
    }
}
