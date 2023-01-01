package Interfaces.exp1;

public class Chien implements Animal{
    @Override
    public void manger() {
        System.out.println("je lèche les os");

    }

    @Override
    public void dormir() {

    }

    @Override
    public void crier() {
        System.out.println("j'aboie");
    }

    @Override
    public void bouger() {

    }
}
