public class Rectangle{
	private double length,breadth;
	public Rectangle(){}
	public Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}	
	public double area()
	{
		return length*breadth;
	}
	
	public double perimeter() {
		return 2*(length+breadth);
	}
	public static void main(String[] args){
		Rectangle r1=new Rectangle();
		r1.length=3;
		r1.breadth=6;
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
	}

}