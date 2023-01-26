package static_;

public class Eleve {

    String nom,prenom;
    
    //if we had , String nom, prenom , ecole 
    //when we are going to instantiate object of this class each attribute will have a place in the memory
    //number of places=number of objects///
    //but school is the same takes one value for each object in this example
    //so we use static
    //but also if this variable is related between objects like in the second example.

    static String ecole;

    //if I want a unique code for each student
    // instead of doing after instantiation student1.code=1 student2.code=2 student3.code=3 .....
    // we do it automatically
    //it's by a constructor and a static variable.
    static int code=0;
    
    public Eleve(){
        code++;
    }
}
