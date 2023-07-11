package polydemo;
public class A
{
	public void show()
	{
		System.out.println("From A");
	}
}
class B extends A
{

	public void show()
	{
		System.out.println("From B");
	}
}
class C extends A
{

	public void show()
	{
		System.out.println("From C");
	}
}

