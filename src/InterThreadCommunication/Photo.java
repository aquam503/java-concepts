package InterThreadCommunication;

public class Photo implements Runnable{
    private int price;
    private int id;
    public Photo(int id,int price){
        this.price=price;
        this.id=id;
    }
    @Override
    public void run() {

    }
}
