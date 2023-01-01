package Synchronized;

public class B implements Runnable{

    @Override
    public void run() {
        B.afficher();
    }
    public static synchronized void afficher(){
        Thread t=Thread.currentThread();
        for(int i=0;i<11;i++){
            System.out.println(i +" displayed by "+t.getName());
        }

    }
    public static void main(String[] args){
        Thread t1=new Thread(new B(),"Thread-1");
        Thread t2=new Thread(new B(),"Thread-2");
        t1.start();
        t2.start();
    }
}
