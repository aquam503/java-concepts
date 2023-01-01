package Interfaces.exp1;

public class Serpent implements Animal{
    @Override
    public void manger() {
        System.out.println("j'empoisonne mes proies");
    }

    @Override
    public void dormir() {

    }

    @Override
    public void crier() {
        System.out.println("je siffle");
    }

    @Override
    public void bouger() {
        System.out.println("je cours");
    }
}
