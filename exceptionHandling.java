package ex;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i,m=9,j,k;
		i=8;
		j=2;
		
		try {
			m=j/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println(m);
		
		
		
	}

}
