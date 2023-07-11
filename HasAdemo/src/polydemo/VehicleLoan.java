package polydemo;
public class VehicleLoan extends Loan
{
	double vehiclePrice;
	public VehicleLoan(int tenure,double roi,double vehiclePrice) {
		super(vehiclePrice,tenure,roi);
		this.vehiclePrice = vehiclePrice*0.7;
	}
	@Override
	public double CalculateEmi() {
		
		return  (((loanAmount*roi*tenure)/100)+loanAmount)/(tenure*12);
	}

}
