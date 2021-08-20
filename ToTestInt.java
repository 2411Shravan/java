



interface test
{
	void square();
}
class arithmatic implements test
{
	int a;
	arithmatic(int a)
	{
		this.a=a;
	}
	public void square()
	{
		System.out.println("The square of "+a+" is: "+a*a);
	}
}
public class ToTestInt 
{
	public static void main(String[] args) {
		System.out.println("This Program is Written by");
		System.out.println("Shravan.V,4ni19is090,B-section");
		System.out.println();
		int a=5;
		test t=new arithmatic(a);
		t.square();
	}
}