package compte_bancaire;
//creer 2 comptes:
//déposer 200$ au compte1
//déposer 500$ au compte2
//retirer 50$ au compte1
//virer 100$ du compte2 au compte1
//afficher solde de chaq compte
public class Main {
    public static void main(String[] args){
        Compte cpt1=new Compte("red");
        Compte cpt2=new Compte("mh");
        cpt1.deposer(2000);
        cpt2.deposer(5000);
        cpt1.retirer(500);
        cpt2.virerVers(1000,cpt1);
        cpt1.afficher();
        cpt2.afficher();
    }
}
