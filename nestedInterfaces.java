


class ads {
	interface ader{
		int calculate() ;
	}
}

class abs implements ads.ader{
	public int calculate() {
		return(5+6);
	}
}




public class nestedInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ads.ader obj = new abs();
		int r=obj.calculate();
		
		System.out.println(r);
		
	}

}
