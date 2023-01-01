package priority;

public class A implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        A r=new A();
        Thread t=new Thread(r,"red");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println("main executed");
    }
}
