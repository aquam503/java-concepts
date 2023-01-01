package getters_setters;

public class Main {

    public static void main(String[] args){
        Personne p1=new Personne();

        /*p1.nom="mahfoud"; ca va donner erreur
        car nom is private ; hna vient le role de
        >setters(pour modifier value of attributes)
        >getters(obtenir acces pour voir its value)
         */

        p1.setNom("mh");
        p1.setPrenom("red");
        p1.setAge(21);

        System.out.println(p1.getNom());
        System.out.println(p1.getPrenom());
        System.out.println(p1.getAge());

        /*ila knti 3atih age pub/default y9d ydir
        p1.age=3000 for example li machi logique en utilsant
        l méthode setter n9d nzid cdt bach nmn3o ydir telles
        actions.
         */

        Personne p2=new Personne();
        p2.setAge(300);
        //marayafectihach raykhli default ici=0
        System.out.println(p2.getAge());
    }
}
