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
            animal.marcher();
        }

        //polymorphism means that an object can take more than one form.

    }
}
