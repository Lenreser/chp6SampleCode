package B;
import A.Person;



public class Course {

    private Person person;
    
    
    public void display(){
        System.out.println(person.x);  //public
       // System.out.println(person.y);  //protected
       // System.out.println(person.z);  //default
    }
}
