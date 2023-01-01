package one;

public class Verre {
    String matiere;
    String boisson;
    int capacite;
    int capacitemaximum;

    void afficherCapacite(){
        System.out.println("la capacité de ce verre : "+capacite);
    }
    void viderVerre(){
        capacite-=5;
    }
    void remplirVerre(){
        capacite+=5;
    }

}

