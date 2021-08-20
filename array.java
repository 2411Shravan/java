import java.io.*;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[4];
		num[0]=2;
		num[1]=4;
		num[2]=5;
		num[3]=6;
		int sum=0;
		for(int i=0;i<4;i++) {
			sum+=num[i];
		}
		System.out.println(sum);
		
		
		//if we know the elements then
		
		
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int a = src.nextInt();
		int fe[]=new int[a];
		
		for(int i=0;i<a;i++) {
			System.out.println("Enter the "+(i+1)+"element");
			int b = src.nextInt();
			fe[i]=b;
		}
		
		
		for(int i=0;i<a;i++) {
			System.out.println(fe[i]);
		}
		//array of objects in initializing objects
		
		
		
		
		
	}

}
