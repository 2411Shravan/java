
class display{
	String number1;
	String number2;
	 public void displayNum(String number1, String number2) {
		 this.number1=number1;
		 this.number2=number2;
	 }
}


public class secondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display myObj;
		myObj = new display();
		myObj.displayNum("hello","world");
		System.out.println(myObj.number1);
		System.out.println(myObj.number2);		
		
		
	}

}
