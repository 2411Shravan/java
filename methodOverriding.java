class Af{
	public void show() {
		System.out.println("Hello world regards A");
	}
}

class Bf extends Af 
{
	//overrides superclass method with subclass
	
	public void show() {
		super.show();
		System.out.println("Hello world regards B");
	}
}





public class methodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bf obj = new Bf();
		obj.show();
		
	}

}
