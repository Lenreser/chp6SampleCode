
public class Test {
    public static void main(String[] args) {
        
        Name name = new Name("Ali", "amat");
       
        Loan myLoan;       
        CarLoan cl = new CarLoan(name, "A123", 2000.0, 500.0);
       
        myLoan = cl;
      
        System.out.println(cl);
       
    }
}
