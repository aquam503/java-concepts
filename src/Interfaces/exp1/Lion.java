package Interfaces.exp1;

public class Lion implements Animal{
    @Override
    public void manger() {
        System.out.println("je dévore");

    }

    @Override
    public void dormir() {

    }

    @Override
    public void crier() {
        System.out.println("je rugis");
    }

    @Override
    public void bouger() {
        System.out.println("je cours");
    }
}
