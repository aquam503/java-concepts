package static_;

public class Eleve {

    String nom,prenom;
    //ila drna String nom,prenom,ecole;
    //min ran instancier objet mn had classe
    //rat3talou blassa f la memoire// kol attr raykon 3ndo blassa
    //y3ni par exp va// riable ecole raykono 3ndo
    //nbr de places=nbr d'objets///
    //mais ecole raha wehda so 3lach man3tiwhach blassa whda
    //fin kaykhdmo ga3 les objet
    //hna katban utilisation de static

    static String ecole;

    //ila bghit ndir l chaq eleve code unique
    //a la place de faire ba3d instaniciation eleve1.code=1
    //eleve2.code=2  eleve3.code=3 .....
    //bghit hadchi b tari9a hssn automatiquement
    //c par un constructeur
    static int code=0;
    //
    public Eleve(){
        code++;
    }
}