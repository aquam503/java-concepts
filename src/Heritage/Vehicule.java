package Heritage;

public class Vehicule {
    private String marque,modele,annee;
    private int vitesse;
    public Vehicule(String ma,String mo,String a){
        this.marque=ma;
        this.modele=mo;
        this.annee=a;
        vitesse=0;
    }

    public int getVitesse() {
        return vitesse;
    }
    public String getAnnee() {
        return annee;
    }
    public String getMarque() {
        return marque;
    }
    public String getModele() {
        return modele;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", annee='" + annee + '\'' +
                ", vitesse=" + vitesse +
                '}';
    }

    public void accelerer(){
        if(vitesse<200) this.vitesse+=5;
        else System.out.println("Vous avez atteint la vitesse maximale");
    }
    public void ralentir(){
        if(vitesse>=5) this.vitesse-=5;
        else System.out.println("le vehicule est arreté");
    }

    public boolean estArretee(){
        return this.vitesse==0;
    }


}
