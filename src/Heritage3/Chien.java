package Heritage3;

public class Chien extends Animal{
    public Chien(String nom) {
        /*before super don't write anything*/
        super(nom);
    }
    public void marcher(){
        System.out.println(this+" marche.");
    }
    //Redefinition of a method is bound with inheritance
    //between a superclass and a subclass
   //we use override
   // we keep the same signature
    @Override
    public void manger(){
        System.out.println(this+" mange un os");}

    // overload a method is done in the same class
   // in the overload we make another signature
     //for java to consider it another method.

    public void marcher(int distance){
        System.out.println(this+" marche "+distance+" km");
    }

    public void marcher(int distance,String jour){
        System.out.println(this+" marche "+distance+" km en "+jour);
    }



}
