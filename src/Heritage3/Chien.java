package Heritage3;

public class Chien extends Animal{
    public Chien(String nom) {
        /*hna 9bel super ma3ndkch lhe9 dir chi haja*/
        super(nom);
    }
    public void marcher(){
        System.out.println(this+" marche.");
    }
    //Redéfinition d'une méthode katkon liée b héritage
    //katkon mabin une super classe et sous classe
    //entre classe parent et classe fille ; we use override
    //f redéfinition méthode katb9alha meme signature
    //kant pub tb9a pub; meme type d'envoi;meme nom;meme parametres
    @Override
    public void manger(){
        System.out.println(this+" mange un os");}

    //Surcharge d'une méthode katkon f la meme classe
    //daba nmchiw ndiro l surcharge d'une méthode
    //prenant marcher() méthod

    //f surcharge khsha tkhtalef signature dl méthode
    //soit tbdl type d'acces ou type de return ou paramétres
    //pour que java y3tabrha une autre méthode.
    //ici we change parameter.

    public void marcher(int distance){
        System.out.println(this+" marche "+distance+" km");
    }

    public void marcher(int distance,String jour){
        System.out.println(this+" marche "+distance+" km en "+jour);
    }



}
