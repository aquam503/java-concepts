package Polymorphisme;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //type reference=objet;

        Chien ch1=new Chien();

        Animal ch2=new Chien();

        ArrayList<Animal> animaux=new ArrayList<>();
        animaux.add(new Chien());
        animaux.add(new Chien());
        animaux.add(new Chat());
        animaux.add(new Chat());
        animaux.add(new Animal());

        for(Animal animal:animaux){
            //3yt 3la méthode d marcher
            //dyal kol type
            animal.marcher();
        }

        //polymorhisme c'est
        //un objet peut prendre plus d'une forme
        //cad plus d'un type.

    }
}
