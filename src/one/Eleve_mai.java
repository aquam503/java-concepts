package one;

import one.Eleve;
import one.Eleve_constructeur;
import one.Eleve_constructeur_parametre;

public class Eleve_mai {
    public static void main(String[] args) {
        Eleve eleve1=new Eleve();
        //les attr vont etre initialisées by default
        System.out.println(eleve1.name);
        System.out.println(eleve1.age);
        System.out.println(eleve1.level);
        System.out.println("***************************");
        Eleve_constructeur eleve2=new Eleve_constructeur();
        System.out.println(eleve2.name);
        System.out.println(eleve2.age);
        System.out.println(eleve2.level);
        System.out.println("***************************");
        Eleve_constructeur_parametre eleve3=new Eleve_constructeur_parametre("ahmed",22,3);
        System.out.println(eleve3.name);
        System.out.println(eleve3.age);
        System.out.println(eleve3.level);
        System.out.println("***************************");
        Eleve_constructeur_parametre eleve4=new Eleve_constructeur_parametre("taha");
        System.out.println(eleve4.name);
    }
    //tu peux définir plusieurs constructeurs dans la meme classe portant le meme nom bien sur de la classe
}
