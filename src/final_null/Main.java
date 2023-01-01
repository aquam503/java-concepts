package final_null;

public class Main {
    public static void main(String[] args){
        //cls1 objet déclaré avec initialisation
        Class cls1=new Class();
        //cls2 objet déclaré sans initialisation
        Class cls2;
        System.out.println(cls1.mot);
        /*donne null car mot est de type String
        So it's an object ; an object not initialized takes null*/

        /*  Class cls2; <=> Class cls2=null;  */


        /* System.out.println(cls2.mot);
        * donne erreur NullPointerException
        * obj null cad not not have been initialized ;
        * tu peux pas accéder à ses attributs ou ses valeurs*/


    }
}
