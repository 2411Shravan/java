package ex;

import java.io.*;
import java.util.*;


class Student{
	String stdUSN;
	String stdNAME;
	String stdBRANCH;
	long stdPH;
	
	Student(String stdUSN, String stdNAME, String stdBRANCH, long stdPH) {
		 this.stdUSN=stdUSN;
		 this.stdNAME=stdNAME;
		 this.stdBRANCH=stdBRANCH;
		 this.stdPH=stdPH;
	}
	 
	void  Display(int j){
		 System.out.println("USN of the student "+(j+1));
		 System.out.println(stdUSN);
		 System.out.println("Name of the student "+(j+1));
		 System.out.println(stdNAME);
		 System.out.println("Branch of the student "+(j+1));
		 System.out.println(stdBRANCH);
		 System.out.println("Phone number of the student "+(j+1));
		 System.out.println(stdPH);
	 }
	
}













public class studentRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program is by SHRAVAN.V 4NI9IS090 B-SECTION\n");
		System.out.println("Student record maintainer\n");
		
		System.out.println("Enter the number of students:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Student obj[]= new Student[a];
		
		for(int i=0;i<a;i++) {
			System.out.println("Enter USN of student " + (i+1));
			String usn = sc.next();
			System.out.println("Enter name of student " + (i+1));
			String name = sc.next();
			System.out.println("Enter branch of student " + (i+1));
			String branch = sc.next();
			System.out.println("Enter contact number of student " + (i+1));
			long ph = sc.nextLong();
			obj[i]=new Student(usn,name,branch,ph);
		}
		
		for(int i=0;i<a;i++) {
			obj[i].Display(i);
		}
		
	}

}
