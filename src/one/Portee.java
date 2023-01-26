package one;

public class Portee {
    static int a=5; //variable globale dans toute la classe
    public static void main(String[] args) {
        echange();
    }
    public static void echange(){
        int b=3;    
        // b variable a portée locale connue
        //seulement f method echange
        if(a>0 & b>0) {
            int temp=a;
            a=b;
            b=temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println("a = "+a+" b= "+b);
    }
}
//https://www.javatpoint.com/why-non-static-variable-cannot-be-referenced-from-a-static-context-in-java
