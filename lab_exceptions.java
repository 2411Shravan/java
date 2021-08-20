package ex;


import java.util.*;
import java.io.*;
public class lab_exceptions {

	
	static void checkedException() throws IOException{
		
		while(true) {
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		System.out.println("Enter your choice \n");
		
		int ch = sc.nextInt();
		
		
		if(ch==1) {
			System.out.println("Enter the first integer : ");
			int f1 = sc.nextInt();
			System.out.println("Enter the second integer : ");
			int f2 = sc.nextInt();
			int result=f1+f2;
			System.out.println("The result is : " + result);
			
			
		}
		else if(ch==2) {
			System.out.println("Enter the first integer : ");
			int f1 = sc.nextInt();
			System.out.println("Enter the second integer : ");
			int f2 = sc.nextInt();
			int result=f1-f2;
			System.out.println("The result is : " + result);
		}
		else if(ch==3) {
			System.out.println("Enter the first integer : ");
			int f1 = sc.nextInt();
			System.out.println("Enter the second integer : ");
			int f2 = sc.nextInt();
			int result=f1*f2;
			System.out.println("The result is : " + result);
		}
		else if(ch==4) {
			System.out.println("Enter the first integer : ");
			int f1 = sc.nextInt();
			System.out.println("Enter the second integer : ");
			int f2 = sc.nextInt();
			int result=f1/f2;
			System.out.print("The result is : ");
			System.out.println(result);
		}
		else if(ch==5) {
			break;
		}
		else {
			throw new IOException("Invalid input from user.This demonstrates checked exception.");
		}
		
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program is by SHRAVAN.V 4NI9IS090 B-Section\n");	
		
		int array[]=new int[5];
		
     try {
    	 checkedException();
    	 
     }
     catch(IOException e) {
    	 System.out.println("Warning " + e);
     }
		
		
		
		
	try {
		int i;
		
		for( i=0;i<=5;i++) {
			array[i]=i;
		}
		
		for( i=0;i<=5;i++) {
			System.out.println(array[i]);
		}
		
		
	}
	catch (Exception e){
		System.out.println(e);
		System.out.println("Here the size of array is 5.But array is made to take and print 6 elements so it is throwing an unchecked exception.");
	}
		
		
		

	}

}
