package getters_setters;

public class Personne {

    private String nom,prenom;
    private int age;

    //getters&setters name kaykon get concaténé m3a its name
    // fais ctrl+espace et ktb get/set et raytl3olk

    public int getAge() {
        return age;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setAge(int age) {
        if(age<150){
            this.age = age;
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
