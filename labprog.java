


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
		System.out.println("Pradhyumna H P, 4NI19IS061, B Section");
		System.out.println();
		int a=10;
		test t=new arithmatic(a);
		t.square();
	}
}