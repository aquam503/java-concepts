package portee_and_this;

import java.util.Scanner;

public class Portee {
    int n1,n2,somme;
    //somme est une variable globale de la classe
    Scanner sc = new Scanner(System.in);
    public void calculerSomme(){
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int somme = n1 + n2;
        //n'est pas la variable précédente,
        //ici c'est local.
        //mais aprés bach thni rassk khdm different names

        //ila baghi had somme hiya li t affecta f global we do:
        this.somme=somme;
        System.out.println(somme);
        //supp ici hna bghit n afficher
        //vari globale somme
        //somme li fo9 raykoun attribut d objet
        //lors de la création so :
        System.out.println(this.somme);
    }
    //donc aprés str li lfo9 li zdnah méthode
    //li ltht afficherSomme mab9atch salha ,
    // we can remove it.
    public void afficherSomme(){
        System.out.println(somme);
        //hna somme n'est pas défini globalement
        //donc raymchi l somme li globale
        //li m difinya 9bel
    }
}
