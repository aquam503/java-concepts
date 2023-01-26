package Heritage3;

public class Animal {
    
    protected String nom,couleur,sexe;

    public Animal(String nom){
        this.nom=nom;
    }

    public void manger(){
        System.out.println(this+" mange");
        
    }

    public void dormir(){
        System.out.println(this+" dort");
    }

    @Override
    public String toString() {
        return nom;
    }
}
