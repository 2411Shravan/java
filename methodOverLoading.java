class firstClass{
	int multiplyResult;
	public void firstClass(int i, int j, int k) {
		multiplyResult = i*j*k;
	}
	
	void display(String r) {
		System.out.println("The multiplication result is " + multiplyResult);
		System.out.println("If the result of multiplication apperas here, then it's not method over ridining"+r);
	}
}

class demoOverWrite extends firstClass{
	int subResult;
	public void firstClass(int i, int j, int k){
		
		subResult = i-j-k;
		
	}
	
	void display(String r) {
		
		System.out.println("The subresult is :" + subResult);
		System.out.println("The above process is "+ r);
	}
}

class biggerNumbers{
	int finalres;
	public biggerNumbers(int i, int j) {
		finalres=i+j;
	}
	void display(String S) {
		System.out.println("The result is :" + finalres);
		System.out.println("The above process is "+ S);
	}
}



class addNumbers extends biggerNumbers{
	int result;
		public addNumbers(int i, int j, int k) {
			super(i,j);
			result=i+j+k;
		}
		void display() {
			System.out.println("The result is :" + result);
			
		}
}




public class methodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program by : Shravan.v \nSection : B\nUSN : 4NI19IS090.");
		System.out.println("Program TO demonstrate OverLoading and OverRiding in JAVA.");
		addNumbers addObj = new addNumbers(4,5,6);
		addObj.display("Over loading");
		
		demoOverWrite subObj = new demoOverWrite();
		subObj.firstClass(10,2,1);
		subObj.display("Over Riding");
		
	}

}
