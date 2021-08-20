package ex;



interface shravan{
	void print();
}

interface shobhs{
	void res();
}

class afters implements shravan{
	public void print() {
		System.out.println("Today is friday");
	}
}



public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shravan obj = new afters();
		obj.print();
		
		
		shobhs ref = new shobhs() {
			public void res() {
				int c = 5+6;
				System.out.println(c);
			}
		};
		
		ref.res();
		
		
		System.out.println();
	}

}
