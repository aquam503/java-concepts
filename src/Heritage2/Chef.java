package Heritage2;

public class Chef extends Employee{
    //et n9d nzid des variables li kaynin hna et makynich f super class
    private double prime;
    //Employee fiha ra constructeur paramétré
    //donc Chef aussi khsha un constructeur paramétré
    public Chef(String nom, String prenom, double salaire,double prime) {
        super(nom, prenom, salaire);
        this.prime=prime;
        //super kat3ni f constructeur duyal chef 3yt 3la
        //constructeur dyal l parent dyalh
        //Employee=super class
    }
    public double getSalaire() {
        return salaire+prime;
    }
}
