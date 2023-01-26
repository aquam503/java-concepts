package one;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // class obj = new Constructeur();
        Verre obj1=new Verre();
        //on utilise un constructeur aussi pour initialiser les variables de la classe
   
        obj1.matiere="Bois";
        obj1.boisson="Eau";
        obj1.capacite=100;
        obj1.capacitemaximum=300;
       
        obj1.afficherCapacite();
        obj1.remplirVerre();
        obj1.remplirVerre();
        obj1.remplirVerre();
        obj1.afficherCapacite();
        obj1.viderVerre();
        obj1.afficherCapacite();
    }
}
