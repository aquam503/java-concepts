package Tableau;

import java.util.Scanner;

public class somme {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float somme=0,moyenne;
        System.out.println("Entrer le nombre de nombres");
        int taille=sc.nextInt();
        float[] notes=new float[taille];
        System.out.println("Entrer les dix notes");
        for(int i=0;i<notes.length;i++){
            notes[i]=sc.nextInt();
            somme+=notes[i];
        }
        moyenne=somme/notes.length;

        System.out.println("La somme est "+somme);
        System.out.println("La moyenne est "+moyenne);
    }
}
