package polydemo;
public class Test1 
{

	public static void main(String[] args) {
		Loan l=null;
		//int noHL=0,noVL=0,noPL=0;
		l= LoanMela.ProduceLoan();
		System.out.println(l.CalculateEmi());
		/*for(int i=1;i<=10;i++)
		{
		l= LoanMela.ProduceLoan();
		System.out.println(l.CalculateEmi());
		if(l instanceof HomeLoan) noHL++;
		else if(l instanceof VehicleLoan) noVL++;
		else noPL++;
		}
		System.out.println("HomeLoan "+noHL);
		System.out.println("Vehicle Loan "+noVL);
		System.out.println("Personal Loan "+noPL);*/
	}

}
