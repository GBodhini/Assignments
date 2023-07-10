//Method Overrididng
class M
{
	public int sum(int x,int y)
	{
		return x+y;
	}
}
class N extends M
{
	public int sum(int x, int y)
	{
		return x-(-y);
	}
}
class Test7
{
	public static void main(String[] args)
	{
		N n1=new N();
		System.out.println(n1.sum(10,20));//calls subclass method
	}
}
