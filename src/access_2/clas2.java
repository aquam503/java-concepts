package access_2;
//les classes : clas2 et modif ne sont pas dans le meme
//pack donc on doit faire :
import access_1.modif;

public class clas2 {
    public static void main(String[] args){
        modif m=new modif();
        int s=m.claculerSomme();
        System.out.println(s);
    }
}
