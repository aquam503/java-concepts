package access_1;

/* Les modificateurs d'accés indiquent si les autres classe
de l'app pourront accéder ou non à la classe/méthode/variable
il y en a 4 : public;protected;default;private. */

public class modif { //class général kaykono public

    /*default = makadir walou kadir class modif
    default , class connu ra f le package where it created
    mat9dch t accesi liha mn package khor wakha dir import : error;
     */
    public int n1=1;//tout le monde
    protected int n2=2;/*les classes de meme package & et les
    classes filles (heritage)*/
    int n3=3;//les classes de meme package (default)
    private int n4=4;/*accessible seulement f had la classe
    min ratcreer objet modif f un autre classe maraytl3lkch n4*/

    /*
    Les variables ml ahssan ykono private : pour sécurité bhal
    ici man3tihch access l n4 car bach maybdlhach min y instancier
    un objet.
     */
    public int claculerSomme(){ //en général kaykono dima pub
        //hna ratkhdm et rah had l methode li rat3yt
        //l n4 pas dak khona f chi classe
        return n1+n2+n3+n4;
    }
}
