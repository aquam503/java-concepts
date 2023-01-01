package one;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //hadak Verre() li 3la limn li fiha parenthése
        // hiya constructeur(method)
        // class obj = new Constructeur();
        Verre obj1=new Verre();
        //on utilise un constructeur pour initialiser les variables
        //de la classe

        //lorsq tu cree class dans java , le constructeur est crée
        //par defaut
        obj1.matiere="Bois";
        obj1.boisson="Eau";
        obj1.capacite=100;
        obj1.capacitemaximum=300;
        //ila lahdti une fois radir obj. rayb9awytl3olk attr+ methodes f l
        //i9tirahat a condition ykono mdefinyin public
        //ila madrti walou par defaut public
        obj1.afficherCapacite();
        obj1.remplirVerre();
        obj1.remplirVerre();
        obj1.remplirVerre();
        obj1.afficherCapacite();
        obj1.viderVerre();
        obj1.afficherCapacite();
    }
}