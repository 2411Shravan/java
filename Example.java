package ex;

import java.io.*;
class Example {  
   public static void main(String args[])throws FileNotFoundException,IOException
   {
	FileInputStream fis = null;
	try{
	    fis = new FileInputStream("B:/myfile.txt"); 
	    fis.read();
	}catch(FileNotFoundException e){
            System.out.println("The specified file is not present at the given path");
	 }
	
   }
}