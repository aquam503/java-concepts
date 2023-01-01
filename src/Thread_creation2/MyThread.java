package Thread_creation2;
//M1
//fach kanbghiw n creer un Thread
//li ran3tiwh a specific task we have to create a class
//fille de Thread class
//to define that
//where we create
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

/* if u have wahd class MyThread extends deja
mn wahd l class A;so now we can't extend from thread
in this case we use implements Runnable

class MyThread extends A implements Runnable
 */
