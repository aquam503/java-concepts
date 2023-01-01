package abstact_class.exp1;

public class Cercle extends Forme {
    private int rayon;
    public Cercle(int rayon){
        this.rayon=rayon;
    }
    @Override
    public void calculerSurface() {
        System.out.println("La surface du cercle est "+Math.PI*rayon*rayon);

    }
}
