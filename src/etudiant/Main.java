package etudiant;

public class Main {
    
    //i used a static object so i can use it in main method
    
    static Etudiant etd1=new Etudiant("name","radouane",1);
    static Etudiant etd2=new Etudiant("name2","firstname2",2);
    public static void main(String[] args){
        Etudiant etd3=new Etudiant("mh","redouane",3);
        System.out.println(etd1.toString());
        etd1.seRePOSER();
        etd2.travailler();
        etd3.seRePOSER();



    }
}
