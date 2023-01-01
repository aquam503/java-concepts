package exo1;
//write a class Number ,a attr =nbr initialisé aléatoirement
//par le constructeur

//méthod afficher() pour l'afficher

//creer obj de la méthode main() pour tester

import java.util.Random;

public class Number {
    int number;
    Random r=new Random();
    public Number(){
        number=r.nextInt();
    }
    public void afficher(){
        System.out.println("Number = "+number);
    }
}
