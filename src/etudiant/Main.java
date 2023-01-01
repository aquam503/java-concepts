package etudiant;

public class Main {
    //zdt static l'objet car sinon on peut pas l'appeler f main
    //method
    static Etudiant etd1=new Etudiant("el mahfoud","radouane",1);
    static Etudiant etd2=new Etudiant("nouali","taha",2);
    public static void main(String[] args){
        Etudiant etd3=new Etudiant("mh","redouane",3);
        System.out.println(etd1.toString());
        etd1.seRePOSER();
        etd2.travailler();
        etd3.seRePOSER();



    }
}
