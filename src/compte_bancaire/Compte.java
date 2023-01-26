package compte_bancaire;

public class Compte {
    int solde=0;
    String Titulaire;
    public Compte(){
    }
    public Compte(String t){
        Titulaire=t;
    }
    public void afficher(){
        System.out.println("La solde de "+this.Titulaire+" est "+solde);
    }
    public void deposer(int montant){
        solde+=montant;
    }
    public void retirer(int montant){
        solde-=montant;
    }
    public void virerVers(int montant,Compte destinataire){
        this.retirer(montant);
        destinataire.deposer(montant);
    }


}
