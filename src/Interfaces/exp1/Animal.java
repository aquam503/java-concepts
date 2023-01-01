package Interfaces.exp1;
/* une interface est une abstract class
qui a que des méthodes abstract
 */
public interface Animal {
    //on peut pas instancier objet de Animal

    //but i still can use polymorphisme
    //Animal a=new Chien();

    //les méthodes f interface dima pub
    //so dima khlihom by default.
    //bla madir abstract rahom deja abstract by default

    void manger();
    void dormir();
    void crier();
    void bouger();
    //sont abstracts donc tu dois les redéfinir.

}
