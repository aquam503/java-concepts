package static_;

public class Main {
    //main method drnaha static bach bla manhtajou
    //n creyiw des objets
    public static void main(String[] args){
        //chi haja static n9do n3ytolha ra
        //bl classe sans création d'objet
        System.out.println(Eleve.code);
        Eleve elv1=new Eleve();
        System.out.println(elv1.code);
        Eleve elv2=new Eleve();
        System.out.println(elv2.code);
        Eleve elv3=new Eleve();
        System.out.println(elv3.code);
        Eleve elv4=new Eleve();
        System.out.println(elv1.code);
        System.out.println(elv2.code);
        System.out.println(elv3.code);
        System.out.println(elv4.code);
        //min ratprinti ratl9ahom b 4
        // 3ndhom meme valeur 4
        //car code fih copie whda
        //kayna wehda ; static attributes are called
        //class attributes.
        elv4.code=6;
        System.out.println(elv4.code);
        Eleve elv5 = new Eleve();
        System.out.println(elv4.code);
        System.out.println(elv5.code);
    }
}
