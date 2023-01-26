package access_1;

/* Les modificateurs d'accés indiquent si les autres classe
de l'application pourront accéder ou non à la classe/méthode/variable
il y en a 4 : public;protected;default;private. */

public class modif { //class général kaykono public

    /*default = 
    default , classe est connu seulement dans le package ou elle crée
    pas d'access d'un autre package ,import => error;
     */
    public int n1=1;//tout le monde
    protected int n2=2;/*les classes de meme package & et les
    classes filles (heritage)*/
    int n3=3;//les classes de meme package (default)
    private int n4=4;/*accessible seulement dans cette classe*/

    /*
    Les variables de préférence => private : pour la sécurité
    */
    public int claculerSomme(){ //en général public
        return n1+n2+n3+n4;
    }
}
