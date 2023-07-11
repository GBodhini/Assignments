package polydemo;
public class PersonalLoan extends Loan
{
	double property;
	public PersonalLoan(int tenure,double roi,double property) {
		super(property,tenure,roi);
		this.property = property*0.8;
	}


	@Override
	public double CalculateEmi() {
		
		return  (((loanAmount*roi*tenure)/100)+loanAmount)/(tenure*12);
	}

}
