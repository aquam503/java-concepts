package Polymorphisme2;

public class Salarie {
    protected double salaire;
    protected String nom;
    public Salarie(String nom){
        this.nom=nom;
    }

    @Override
    public String toString() {
        return nom;
    }

    public void afficherSalaire(){
        System.out.println("le salaire de "+this+" est "+this.salaire);
    }

}
