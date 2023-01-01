package thread_creation_m2;

public class Main {
    public static void main(String[] args){
        Thread t2 =new Thread(new T2());
        t2.start();
    }
}
