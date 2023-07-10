class Homeloan extends Loan
{
	private int property_value;
	public Homeloan() {}
	public Homeloan(int eMI, int id, int amount, double interest, double tenure,int property_value) {
		super(eMI,id,amount,interest,tenure);
		this.property_value = property_value;
	}
	public int getProperty_value() {
		return property_value;
	}
	public void setProperty_value(int property_value) {
		this.property_value = property_value;
	}
	
}
