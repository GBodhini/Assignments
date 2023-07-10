class Test3 {

	public static void main(String[] args) 
	{
		Homeloan h=new Homeloan(40000,3,90000,5.0,3.3,80000);
		Vehicleloan v=new  Vehicleloan(50000,6,35000,3.5,1,55000);
		System.out.println("Home Loan");
		System.out.println("emi: "+ h.getEMI());
		System.out.println("id: "+ h.getId());
		System.out.println("Amount: "+ h.getAmount());
		System.out.println("interest: "+h. getInterest());
		System.out.println("tenure: "+ h.getTenure());
		System.out.println("property_value: "+h.getProperty_value());
		
		System.out.println("Vehicle Loan");
		System.out.println("emi: "+ v.getEMI());
		System.out.println("id: "+ v.getId());
		System.out.println("Amount: "+ v.getAmount());
		System.out.println("interest: "+v. getInterest());
		System.out.println("tenure: "+ h.getTenure());
		System.out.println("vehicleprice: "+ v.getVehicleprice()) ;
		
		
	}

}
