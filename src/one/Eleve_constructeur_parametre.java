package one;

public class Eleve_constructeur_parametre {
    String name;
    int age;
    int level;
    //on fait pas le type d'envoi dans un constructeur directement public name();
    public Eleve_constructeur_parametre(String n,int a,int l){
        name=n;
        age=a;
        level=l;
    }
    //un autre constructeur qui vous permet d'initialiser l'objet avec seulement un paramétre
    public Eleve_constructeur_parametre(String n){
        name=n;
    }
}
