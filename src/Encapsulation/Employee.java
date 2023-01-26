package Encapsulation;

public class Employee {
    //Encapsulation = access via methods ;(getters & setters)
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
