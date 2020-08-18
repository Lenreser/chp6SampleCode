
public class PersonalLoan extends Loan{
    private String guarantor;
    
    public PersonalLoan() {
    }
  
    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }
}
