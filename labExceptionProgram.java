package ex;

public class labExceptionProgram {

	public static void main(String[] args) throws MyException{
		// TODO Auto-generated method stub
		 
				
				System.out.println("This programme is by ");
				System.out.println("Shravan V 4NI19IS090 B-Section");
				
				
				try
				{
					throw new MyException("Custom exception is here");
				}
				
				catch(MyException e)
				{
					System.out.println("Exception will be Caught Here");
					System.out.println(e.getMessage());
				}
				
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				
				try {
					int j=10;
					int m;
					m=j/0;
					
				}
				
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
				
				try {
					int m[]= new int[8];
					for(int k=0;k<=8;k++) {
						m[k]=k+1;
					}
					
				}
				
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}

			}

		}


class MyException extends Exception
{
		public MyException(String m) {
			super(m);
			
		}
			
}