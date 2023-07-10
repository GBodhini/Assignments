class Loan{
	private int EMI;
	private int id;
	private int amount;
	private double interest;
	private double tenure;
	public Loan() {}
	public Loan(int eMI, int id, int amount, double interest, double tenure) {
		super();
		EMI = eMI;
		this.id = id;
		this.amount = amount;
		this.interest = interest;
		this.tenure = tenure;
	}
	public int getEMI() {
		return EMI;
	}
	public void setEMI(int eMI) {
		EMI = eMI;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getTenure() {
		return tenure;
	}
	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	
	
}