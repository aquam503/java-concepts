package Interfaces.exp1;
/* interface is an abstract class
that has abstract methods.
 */
public interface Animal {
    //we can't instantiate object of Animal

    //but we still can use polymorphisme
    //Animal a=new Chien();

    //interface methods are always public.
    //so you can let them by default.
    //you don't have to mention abstract in these methods because they are by default.

    void manger();
    void dormir();
    void crier();
    void bouger();
    //are abstract so you have to redefine them.

}
