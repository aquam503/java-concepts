package String_class;

public class Main {
    public static void main(String[] args) {

        String s="redouane";
        int n=0;    // n pas un objet
        //String classe f java ;s raha objet
        //pas de type primitif
        //n est un variable de type primitif int pas un objet
        // String s="redouane"; had tari9a daroha pour faciliter 3l les
        //programmeur puisque String est beaucoup utilisé
        //normalement le syntax est ://

        String s1=new String("red");
        System.out.println(s.charAt(n)); //char d'indice n
        System.out.println(s1.length());

        if (s1.startsWith("r")){
            System.out.println("le mot commence par r");
        }
        else{
            System.out.println("le mot ne commence pas par r");
        }

        if (s1.endsWith("r")){
            System.out.println("le mot termine par r");
        }
        else{
            System.out.println("le mot ne termine pas par r");
        }

        if (s1.equals(s)){
            System.out.println("les deux mot sont égaux");
        }
        else{
            System.out.println("les deux mot ne sont pas égaux");
        }

        String s2="Red";
        String s3="rEd";
        if (s2.equalsIgnoreCase(s3)){
            System.out.println("les deux mot sont égaux ");
        }
        else{
            System.out.println("les deux mot ne sont pas égaux");
        }

        String s4=s2.concat(s3);
        System.out.println("s4 = "+s4);

        String s5=s4.substring(2,4); //d'indice 2 et 3
        System.out.println("s5 ="+s5);

        String s6=s4.replace("rEd"," MH");
        System.out.println("s6 ="+s6);
    }
}
