package Tableau;

public class Tableau {

    public static void main(String[] args){

        double[] notes=new double[10];

        notes[0]=15.5;
        notes[8]=9;
        notes[8]=12;

        System.out.println(notes[0]);
        System.out.println(notes[1]);

        double[] T={8.5,5.5,10,12.5};
        System.out.println(T[1]);
        System.out.println("Parcours de tableau notes ");
        for(int i=0;i<notes.length;i++){
            System.out.println(notes[i]);
        }

    }
}
