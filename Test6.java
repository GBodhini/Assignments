class X
{
	public void message()
	{
		System.out.println("From X");
	}
}
class Y extends X
{
	public  void message()
	{
		System.out.println("From Y");
	}
}
class Test6
{
	public static void main(String[] args)
	{
		Y y1=new Y();
		y1.message();
		y1.message();
		
	}
}
