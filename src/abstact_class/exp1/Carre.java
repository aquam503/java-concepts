package abstact_class.exp1;

public class Carre extends Forme {
    private int cote;
    public Carre(int cote){
        this.cote=cote;
    }
    @Override
    public void calculerSurface() {
        System.out.println("La surface du carree est "+cote*cote);
    }

}
