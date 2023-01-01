package Heritage;

public class Chauffeur {
    public static void main(String[] args){
        Voiture v1=new Voiture("BMW","hangi","2007");
        //min ratbghi t afficher l'objet kaymchi ychof wach 3ndk
        //method toString() to run it hiya li mkelfa bl affichage.
        System.out.println(v1);
        /**/
        System.out.println(v1.getVitesse());
        for(int i=0;i<8;i++) v1.accelerer();
        System.out.println(v1.getVitesse());
        v1.ralentir();
        System.out.println(v1.getVitesse());
        v1.setVitesse(100);
        System.out.println(v1.getVitesse());
        System.out.println(v1.estArretee());

        Camion c=new Camion("m","mod","2022");
        c.ralentir();
        System.out.println(c.estArretee());

    }
}
