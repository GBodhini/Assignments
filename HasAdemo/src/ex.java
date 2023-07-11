class Parent
{
	public int sum(int x, int y)
	{
		return x+y;
	}
}
class Child extends Parent
{
	public int sum(int x,int y)
	{
		return x-(-y);
	}
}


public class ex
{
	public static void main(String[] args)
	{
		Child c=new Child();
		System.out.println(c.sum(5, 6));
	}
}
