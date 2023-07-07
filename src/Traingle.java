class Traingle{
	public static void main(String[] args){
		Math t1 = new Math();
		t1.breadth=4.5;
		t1.height=5.5;
		System.out.println(t1.area());
	}
}
class Math{
	double breadth;
	double height;
	public double area(){
		return 0.5*breadth*height;
	}
}