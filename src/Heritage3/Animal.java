package Heritage3;

public class Animal {
    //protected hiya li kansta3molha pour
    //heritage
    protected String nom,couleur,sexe;

    public Animal(String nom){
        this.nom=nom;
    }

    public void manger(){
        System.out.println(this+" mange");
        //this bach y afficher l objet raymchi
        //donc l3nd toString
    }

    public void dormir(){
        System.out.println(this+" dort");
    }

    @Override
    public String toString() {
        return nom;
    }
}
