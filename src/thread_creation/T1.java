package thread_creation;

public class T1 extends Thread{
    @Override
    public void run(){
        System.out.println("I'm the first thread T1");
    }
    //public static void main(String[] args){
    //    T1 obj1=new T1();
    //    obj1.start(); u can also start your thread here by using just one file.

}
