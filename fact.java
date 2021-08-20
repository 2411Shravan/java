
public class fact {

	public static void main(String[] args) {
		System.out.println("This Program is Written by");
		System.out.println("Shravan V, 4NI19IS090, B Section");
		System.out.println();
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of "+num+" is " +fact);

	}
}