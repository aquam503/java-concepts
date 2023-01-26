package Thread_creation2;

class Hi extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {Thread.sleep(5000);}//5seconde
            catch(Exception e){}
        }
    }
}

class Hello extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {Thread.sleep(5000);}//5seconde
            catch(Exception e){}
        }
    }
}

public class MyThread2 {
    public static void main(String[] args){
    Hi hi=new Hi();
    Hello he=new Hello();
    hi.start();
    try {Thread.sleep(50);}//50 miliseconde
    catch(Exception e){}
    he.start();
    System.out.println("*******");
    }
}
