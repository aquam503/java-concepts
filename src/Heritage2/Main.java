package Heritage2;

public class Main {
    public static void main(String[] args){
        Chef chef1=new Chef("mh","red",20000,2500);
        Employee emp1=new Employee("mh","mer",10200);
        System.out.println(chef1);
        System.out.println(emp1);
        System.out.println(emp1.getSalaire());
        
        System.out.println(chef1.getSalaire());
    
        System.out.println(chef1.getNom());

    }
}
