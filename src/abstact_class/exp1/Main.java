package abstact_class.exp1;

import abstact_class.exp1.Carre;
import abstact_class.exp1.Cercle;

public class Main {
    public static void main(String[] args){
        // error Forme forme1=new Forme();
        //on peut pas creer un objet a partir de : an abstract class.
        //abstract class est crée pour héritage.
        //abstract is used in games too://classe entité
        //car Forme ca reste abstract

        Carre ca=new Carre(4);
        Cercle ce=new Cercle(2);
        ca.calculerSurface();
        ce.calculerSurface();




    }
}
