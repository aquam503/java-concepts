package Polymorphisme2;

import java.util.ArrayList;

public class payement {
    public static void main(String[] args){
        Directeur d=new Directeur("red");
        chef c =new chef("omar");
        ouvrier o=new ouvrier("ahmed");

        ArrayList<Salarie> salaries=new ArrayList<>();
        salaries.add(d);
        salaries.add(c);
        salaries.add(o);

        for(Salarie s:salaries){
            s.afficherSalaire();
        }




    }
}
