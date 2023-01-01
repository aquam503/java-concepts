package thread_exp1;

public class thread_exp1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(i);
        }
    }
}
