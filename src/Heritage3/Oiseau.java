package Heritage3;



public class Oiseau extends Animal{

    public Oiseau(String nom) {
        super(nom);
    }
    public void voler(){
        System.out.println(this+" vole.");
    }
    //this => program goes to toString() method.
}
