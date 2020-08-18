
public class CarLoan extends Loan{

    private double monthlyInstallment;
    
    public CarLoan(Name name, String accNo,
      double amount, double monthlyInstallment){
      
        super(name, accNo, amount);
        this.monthlyInstallment =monthlyInstallment;
    }
  
    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }
    
    public String toString(){
        return  super.toString() + "\n" +
                "monthly Installment : " + monthlyInstallment;
    }
    
}
