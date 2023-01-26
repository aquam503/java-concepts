package Heritage2;

public class Chef extends Employee{
    //we can add here new parameters for Chef class
    private double prime;
    //Employee class has parameterized constructor
    //so Chef also
    public Chef(String nom, String prenom, double salaire,double prime) {
        super(nom, prenom, salaire);
        this.prime=prime;
        //super used like to call chef class constructor 
        //parent of this class
        //Employee=super class
    }
    public double getSalaire() {
        return salaire+prime;
    }
}
