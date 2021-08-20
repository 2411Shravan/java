package ex;

public class exceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[4];	
		int i,j,k=8;
		i=9;j=3;

		
		try {
		k=i/j;
		System.out.println(k);
		System.out.println();
		System.out.println();
		for(int m=0;m<=4;m++) {
			a[m]=m;
		}
		for(int m=0;m<=4;m++) {
			System.out.println(a[m]);
		}
		
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide the given number by zero as result tend to infinity");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
	}

}
