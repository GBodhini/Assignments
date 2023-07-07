import java.util.Scanner;
class Tax{
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the monthly income");
		double income=s.nextDouble();
		income=income*12;
		double taxAmount=tax(income);
		System.out.println("Tax is: "+ taxAmount);
	}
public static double tax(double income){
	if(income<=250000){
		return 0;
	}
	else if(income<=500000){
		return (income-250000)*0.1;
	}
	else if(income<=1000000){
		return 25000+(income-500000)*0.2;
	}
	else{
		return 125000+(income-1000000)*0.3;
	}
	
   }
}