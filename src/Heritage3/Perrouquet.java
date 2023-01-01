package Heritage3;


//public class Perrouquet extends Oiseau,Animal pas
//acceptable f java ; java mafihch HERITAGE MULTIPLE
//java mafihch HERITAGE MULTIPLE pour les classes.
public class Perrouquet extends Oiseau{

    public Perrouquet(String nom) {
        super(nom);
    }
    public void parler(){
        System.out.println(this+" parle");
    }
}
