package Encapsulation;

public class Employee {
    //Encapsulation hiya maykon 3ndk lhe9 t accéder l
    //chi variable soit t9raha ou t modifier
    //ila 3an tari9 les méthodes;(getters & setters)
    private String nom;
    private double salaire;

    public double getSalaire() {
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
