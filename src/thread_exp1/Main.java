package thread_exp1;

public class Main {
    public static void main(String[] args){
        thread_exp1 t1=new thread_exp1();
        thread_exp1 t2=new thread_exp1();
        System.out.println("main thread");
        t1.start();
        t2.start();
    }
}
