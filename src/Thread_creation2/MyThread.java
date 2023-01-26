package Thread_creation2;
//M1
public class MyThread extends Thread{
    int[] values={6,5,1,7,8};
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            values[i]=values[i]*2;
        }
    }
}

/* Thread t1=new MyThread();
   to create a new thread ; autre que celui du main
   u have to use start;
   t1.start();
   run will be called automatically when u call start.
 */

/* 
class MyThread extends A implements Runnable
 */
