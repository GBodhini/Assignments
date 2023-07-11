package polydemo;
public class Test 
{
	public static void main(String[] args)
	{

		Shape s=null;
		int noR=0,noT=0,noC=0;
		for(int i=1;i<=10;i++)
			{
			s= ShapesFactory.ProduceShape();
			System.out.println(s.area());
			if(s instanceof Circle) noC++;
			else if(s instanceof Rectangle) noR++;
			else noT++;
			}
		System.out.println("Circles "+noC);
		System.out.println("Rectangles "+noR);
		System.out.println("Triangles "+noT);
	}

}
