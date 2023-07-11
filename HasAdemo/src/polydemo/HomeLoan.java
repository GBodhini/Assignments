package polydemo;
import java. lang. Math;
public class HomeLoan extends Loan
{
	double propertyValue;
	public HomeLoan(int tenure,double roi,double propertyValue) {
		super(propertyValue,tenure,roi);
		this.loanAmount=propertyValue*0.9;
	}


	@Override
	public double CalculateEmi() {
	
		return (((loanAmount*roi*tenure)/100)+loanAmount)/(tenure*12);
	}

}
