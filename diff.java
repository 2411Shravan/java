package ex;


interface af{
	void si();
}


class after implements af{
	public void si() {
		System.out.println("hai hello");
	}
}
public class diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		af obj = new after();
		obj.si();
		
	}

}
