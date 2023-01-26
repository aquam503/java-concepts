package static_;

public class Main {
    //main method = static so we don't need to create objects.
    //so we can call it without object creation.
    public static void main(String[] args){
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
        elv4.code=6;
        System.out.println(elv4.code);
        Eleve elv5 = new Eleve();
        System.out.println(elv4.code);
        System.out.println(elv5.code);
    }
}
