package etudiant;

public class Etudiant {
    String nom,prenom;
    int codeId;
    //constructeur
    public Etudiant(String n,String p,int c){
        nom=n;
        prenom=p;
        codeId=c;
    }
    public String toString(){
        return "l'étudiant "+nom+" "+prenom+" de code "+codeId;
    }
    public void travailler(){
        System.out.println( "l'étudiant "+nom+" "+prenom+" travaille.");
    }
    public void seRePOSER(){
        System.out.println( "l'étudiant "+nom+" "+prenom+" se repose.");
    }
}
