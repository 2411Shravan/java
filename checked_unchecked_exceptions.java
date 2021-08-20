package ex;


//Checked exceptions must be handled or declared otherwise it causes compile time error .
//In case of Unchecked exception no need of handling or declaration , it won't causes compile time error.

import java.util.*;
import java.io.*;

public class checked_unchecked_exceptions
{
	static void checked() throws IOException
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		int lucky_number=19;
		
		do
		{    
				System.out.println("\nEnter your choice:\n1. Blue\n2. Red\n3. Yellow\n");
				choice = sc.nextInt();
//				System.out.println("");
				
				if(choice == 1)
				{
					int a=7; //It's  a secret number
					if(a==lucky_number) {
						
						System.out.println("Congrats !! You have won the lottery , the lucky number was " + a/1);
					}
					else {
						System.out.println("Better luck next time ");
						System.out.println("");
					}
					
				}
				
				else if(choice == 2)
				{
					int b=19; //It's  a secret number
					if(b==lucky_number) {
						System.out.println("Congrats !! You have won the lottery , the lucky number was " + b/1);
					}
					else {
						System.out.println("Better luck next time ");
					}
					
				}
				
				else if(choice == 3)
				{
					int c=21; //It's  a secret number
					if(c==lucky_number) {
						System.out.println("Congrats !! You have won the lottery , the lucky number was " + c/1);
					}
					else {
						System.out.println("Better luck next time ");
					}
					
				}
				
				else
				{
					throw new IOException("Sorry !! Invalid number");
				}
				
		}while(choice != 0 && choice <= 3);
		
		sc.close();
	}

	public static void main(String[] args)
	{
		System.out.println("This program is written by\nName: SHREYAS R SHETTIGAR \nUSN: 4NI19IS094 \nB Section\n");
		
		try
		{
			checked();
		}
		catch (IOException e)
		{
			System.out.println("Checked Exception IOException occured: " + e);
			int secret_number = 19;
			System.out.println("\n\nYou haven't entered any specified number so the secret_number becomes secret_number/0 which will gives Unchecked Exception which shows runtime error");
			System.out.println((secret_number/0));
		}
		
		
		
		
		
		

	}

}
