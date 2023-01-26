package getters_setters;

public class Main {

    public static void main(String[] args){
        Personne p1=new Personne();

        /*p1.nom="redouane"; ca va donner erreur because 'nom' is private ; 
        >setters(pour modifier value of attributes)
        >getters(obtenir acces pour voir its value)
         */

        p1.setNom("mh");
        p1.setPrenom("red");
        p1.setAge(21);

        System.out.println(p1.getNom());
        System.out.println(p1.getPrenom());
        System.out.println(p1.getAge());

        

        Personne p2=new Personne();
        p2.setAge(300);
        
        System.out.println(p2.getAge());
    }
}
