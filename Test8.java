import java.time.LocalDate;
class Test8 {

	public static void main(String[] args) 
	{
		Account1 a1=new Account1(7001,55000.00,"Ajay Sahith",LocalDate.now());
		Account1 a2=new Account1(7001,55000.00,"Ajay Sahith",LocalDate.now());
		System.out.println(a1.equals(a2));
	}

}
