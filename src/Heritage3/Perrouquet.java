package Heritage3;


//java does not support multiple inheritance.
public class Perrouquet extends Oiseau{

    public Perrouquet(String nom) {
        super(nom);
    }
    public void parler(){
        System.out.println(this+" parle");
    }
}
