
public class Loan extends Object{
   
    private Name applicantName;
    private String accNo;
    private double amount;
    
    public Loan(){
        System.out.println("A");
    }

    public Loan(Name applicantName, String accNo, double amount) {
        this.applicantName = applicantName;
        this.accNo = accNo;
        this.amount = amount;
    }
    
    public Name getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(Name applicantName) {
        this.applicantName = applicantName;
    }
           
    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String toString(){
        return "Name : " + applicantName.getFName() +
                  " " + applicantName.getLName() + "\n" + 
                "Amount : " + amount + "\n" +
                "Account No : " + accNo;
             
    }

}
