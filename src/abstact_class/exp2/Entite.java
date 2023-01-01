package abstact_class.exp2;

import java.util.ArrayList;

public abstract class Entite {
    public abstract void dessiner();
    /*if il existe au moins méthode abstract dans la classe
    donc la classe doit etre aussi abstract*/
    //une classe abstract contient au moins une méthode abstract
    public static void main(String[] args) {
        Joueur j = new Joueur();
        Enemie e = new Enemie();
        Arme a = new Arme();

        j.dessiner();
        e.dessiner();
        a.dessiner();

        ArrayList<Entite> l = new ArrayList<>();
        l.add(j);
        l.add(e);
        l.add(a);
        System.out.println("*****************");
        for (Entite t : l) t.dessiner();
    }
}
