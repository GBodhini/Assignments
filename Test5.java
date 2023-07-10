class H
{
	int x=10;
	public H() {
	System.out.println("A is created");}
}
class G extends H
{
	int y=20;
	public G() {
	System.out.println("B is created");}
}
class I extends G
{
	int z=30;
	public I() {
	System.out.println("C is created");}
}
public class Test5
{
	public static void main(String[] args)
	{
		I c1=new I();
		System.out.println(c1.x+" "+c1.y+" "+c1.z);
	}
}
