class Vehicleloan extends Loan
{
	private int vehicleprice;
	public Vehicleloan() {}
	public Vehicleloan(int eMI, int id, int amount, double interest, double tenure,int vehicleprice) {
		super(eMI,id,amount,interest,tenure);
		this.vehicleprice = vehicleprice;
	}
	public int getVehicleprice() {
		return vehicleprice;
	}
	public void setVehicleprice(int vehicleprice) {
		this.vehicleprice = vehicleprice;
	}
	
	
	
}
