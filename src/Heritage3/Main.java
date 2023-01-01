package Heritage3;

public class Main {
    public static void main(String[] args){
        Animal animal1=new Animal("anima");
        animal1.manger();
        Chien chien1=new Chien("boby");
        chien1.marcher();
        Oiseau oiseau1=new Oiseau("pirich");
        oiseau1.voler();
        //Heritage successive
        Perrouquet p1=new Perrouquet("talky");
        p1.parler();
        chien1.manger();
        chien1.marcher();
        chien1.marcher(10);
        chien1.marcher(10,"Mardi");

    }
}
