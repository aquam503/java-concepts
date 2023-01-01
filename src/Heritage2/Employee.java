package Heritage2;

public class Employee {
    private String nom,prenom;
    protected double salaire;

    public Employee(String nom,String prenom,double salaire){
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
