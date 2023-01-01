package Heritage2;

public class Main {
    public static void main(String[] args){
        Chef chef1=new Chef("mh","red",20000,2500);
        Employee emp1=new Employee("mh","mer",10200);
        System.out.println(chef1);
        System.out.println(emp1);
        System.out.println(emp1.getSalaire());
        //Affiche 10200 c'est bon
        System.out.println(chef1.getSalaire());
        //Affiche 20000 c'est pas bon il faut ajouter prime
        //Min kadir chef1.getSalaire() kaymchi l classe chef
        //Makayl9acha donc kaymchi ychouf heritage
        //Daba ana meme méthode bghit ndirlha : Redéfinition.
        //voir classe Chef
        //Redéfinition =khss yb9a signature dyal methode elle
        //meme cad public double getSalaire() hada matbdel fih walou
        System.out.println(chef1.getNom());

    }
}
