package polydemo;
abstract public class Loan 
{
	double loanAmount;
	int tenure;
	double roi;
	 
	public Loan(double loanAmount, int tenure, double roi) {
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.roi = roi;
	}
	

	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public int getTenure() {
		return tenure;
	}


	public void setTenure(int tenure) {
		this.tenure = tenure;
	}


	public double getRoi() {
		return roi;
	}


	public void setRoi(double roi) {
		this.roi = roi;
	}


	abstract public double CalculateEmi();
}
