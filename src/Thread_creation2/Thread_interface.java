package Thread_creation2;

//start method not in Runnable interface

class Hi_ implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {Thread.sleep(5000);}//5seconde
            catch(Exception e){}
        }
    }
}

class Hello_ implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {Thread.sleep(5000);}//5seconde
            catch(Exception e){}
        }
    }
}


public class Thread_interface {
    public static void main(String[] args) throws InterruptedException {
        Hi_ hi=new Hi_();
        Hello_ he=new Hello_();
        /* u can also do
        Runnable hi=new Hi_();
        Runnable he=new Hello_();
         */
        Thread t1=new Thread(hi);
        Thread t2=new Thread(he);

        System.out.println("hadi 9blel start of threads donc dima lewla");

        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5

        /*
        range of priority goes from 1 to 10
        1:least priority
        10:highest priority
        5:normal priority
         */

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        try {Thread.sleep(50);}//50 miliseconde
        catch(Exception e){}
       
        t2.start();

      


        System.out.println("55*****");
        t1.join();//exectued by main thread
        t2.join();//exectued by main thread

        System.out.println(t1.isAlive());
  
        System.out.println("*******");
    }
}
